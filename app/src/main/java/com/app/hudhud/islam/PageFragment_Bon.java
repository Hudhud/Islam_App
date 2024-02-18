package com.app.hudhud.islam;

import android.graphics.Typeface;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;

public class PageFragment_Bon extends Fragment implements View.OnClickListener {

    public static final String ARG_PAGE = "ARG_PAGE";
    private int mPage;
    private Button start, stop, replay;
    private MediaPlayer mediaPlayer;
    private final int[] filer = new int[18];

    public static PageFragment_Bon newInstance(int page) {
        Bundle args = new Bundle();
        args.putInt(ARG_PAGE, page);
        PageFragment_Bon fragment = new PageFragment_Bon();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mPage = getArguments().getInt(ARG_PAGE);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_boenner, container, false);
        initializeUI(view);
        return view;
    }

    private void initializeUI(View view) {
        TextView tvTitle = view.findViewById(R.id.handling);
        ImageView stilling = view.findViewById(R.id.stilling);
        TextView tvTitle2 = view.findViewById(R.id.arabisk);

        start = view.findViewById(R.id.start);
        start.setOnClickListener(this);

        stop = view.findViewById(R.id.stop);
        stop.setOnClickListener(this);

        replay = view.findViewById(R.id.replay);
        replay.setOnClickListener(this);

        // Initialize audio files
        filer[2] = R.raw.takbira;
        filer[4] = R.raw.alfatiha;
        filer[14] = R.raw.tashahhud;
        filer[15] = R.raw.salat;
        filer[16] = R.raw.assalam;

        // Show or hide media buttons
        if (filer[mPage] != 0) {
            start.setVisibility(View.VISIBLE);
            stop.setVisibility(View.VISIBLE);
            replay.setVisibility(View.VISIBLE);
        }

        // Initialize text content
        String text = ""; // default_text is a placeholder
        switch (mPage) {
            case 0:
                text = getString(R.string.bon_intro);
                break;
            case 1:
                text = getString(R.string.bon_hensigt);
                break;
            case 2:
                text = getString(R.string.bon_takbirah);
                break;
            case 3:
                text = getString(R.string.bon_qiyam);
                break;
            case 4:
                text = getString(R.string.bon_fatihah);
                break;
            case 5:
                text = getString(R.string.bon_ruku);
                break;
            case 6:
                text = getString(R.string.bon_tumaninah_ruku);
                break;
            case 7:
                text = getString(R.string.bon_itidal);
                break;
            case 8:
                text = getString(R.string.bon_tumaninah_itidal);
                break;
            case 9:
                text = getString(R.string.bon_sujud);
                break;
            case 10:
                text = getString(R.string.bon_tumaninah_sujud);
                break;
            case 11:
                text = getString(R.string.bon_sit_between_sujud);
                break;
            case 12:
                text = getString(R.string.bon_tumaninah_sit);
                break;
            case 13:
                text = getString(R.string.bon_last_tashahhud);
                break;
            case 14:
                text = getString(R.string.bon_tashahud_saying);
                break;
            case 15:
                text = getString(R.string.bon_salat);
                break;
            case 16:
                text = getString(R.string.bon_salam);
                break;
            case 17:
                text = getString(R.string.bon_order);
                break;
            default:
                break;
        }
        tvTitle.setText(text);

        // Initialize custom font
        String Path2font = "DroidNaskh-Regular.ttf";
        Typeface tf = Typeface.createFromAsset(requireContext().getAssets(), Path2font);
        tvTitle2.setTypeface(tf);

        // Initialize Arabic text
        String arabicText = "";
        switch (mPage) {
            case 4:
                arabicText = getString(R.string.arabic_fatihah);
                break;
            case 14:
                arabicText = getString(R.string.arabic_tashahhud);
                break;
            // ... (other cases)
        }
        if (!arabicText.isEmpty()) {
            tvTitle2.setVisibility(View.VISIBLE);
            tvTitle2.setText(arabicText);
        }

        int[] billede = new int[18];
        billede[2] = R.mipmap.sojle1;
        billede[3] = R.mipmap.sojle4;
        billede[4] = R.mipmap.sojle2;
        billede[5] = R.mipmap.sojle3;
        billede[7] = R.mipmap.sojle4;
        billede[9] = R.mipmap.sojle6;
        billede[11] = R.mipmap.sojle7;
        billede[13] = R.mipmap.sojle8;
        billede[16] = R.mipmap.sojle9;

        if (billede[mPage] != 0) {
            stilling.setVisibility(View.VISIBLE);
            stilling.setImageResource(billede[mPage]);
        }
    }

    @Override
    public void onPause() {
        super.onPause();
        releaseMediaPlayer();
    }

    private void releaseMediaPlayer() {
        if (mediaPlayer != null) {
            mediaPlayer.stop();
            mediaPlayer.release();
            mediaPlayer = null;
        }
    }

    @Override
    public void onClick(View v) {
        if (mediaPlayer == null) {
            mediaPlayer = MediaPlayer.create(requireContext(), filer[mPage]);
        }

        switch (v.getId()) {
            case R.id.start:
                mediaPlayer.start();
                break;
            case R.id.stop:
                mediaPlayer.pause();
                break;
            case R.id.replay:
                mediaPlayer.seekTo(0);
                mediaPlayer.start();
                break;
        }
    }

    @Override
    public void setUserVisibleHint(boolean isVisibleToUser) {
        super.setUserVisibleHint(isVisibleToUser);
        if (!isVisibleToUser) {
            releaseMediaPlayer();
        }
    }
}
