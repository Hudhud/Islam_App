/*
 * Copyright (C) 2011 Iranian Supreme Council of ICT, The FarsiTel Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASICS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.app.hudhud.islam.logic;

/*
 * This class represent logic for computing Target angle form north
 */

public class LocationDirectionCalculator {
    public static final double LOCATION_LATITUDE = Math.toRadians(21.3890824);
    public static final double LOCATION_LONGITUDE = Math.toRadians(39.85791180000001);

    public static double getLocationDirectionFromNorth(double degLatitude,
                                                       double degLongitude) {
        double latitude2 = Math.toRadians(degLatitude);
        double longitude = Math.toRadians(degLongitude);

        double s = Math.sin(LOCATION_LONGITUDE - longitude);
        double m = Math.cos(latitude2) * Math.tan(LOCATION_LATITUDE)
                - Math.sin(latitude2) * Math.cos(LOCATION_LONGITUDE - longitude);
        double returnValue = Math.toDegrees(Math.atan(s / m));

        if (latitude2 > LOCATION_LATITUDE) {
            if ((longitude > LOCATION_LONGITUDE || longitude < (Math
                    .toRadians(-180d) + LOCATION_LONGITUDE))
                    && (returnValue > 0 && returnValue <= 90)) {

                returnValue += 180;

            } else if (!(longitude > LOCATION_LONGITUDE || longitude < (Math
                    .toRadians(-180d) + LOCATION_LONGITUDE))
                    && (returnValue > -90 && returnValue < 0)) {

                returnValue += 180;

            }

        }
        if (latitude2 < LOCATION_LATITUDE) {

            if ((longitude > LOCATION_LONGITUDE || longitude < (Math
                    .toRadians(-180d) + LOCATION_LONGITUDE))
                    && (returnValue > 0 && returnValue < 90)) {

                returnValue += 180;

            }
            if (!(longitude > LOCATION_LONGITUDE || longitude < (Math
                    .toRadians(-180d) + LOCATION_LONGITUDE))
                    && (returnValue > -90 && returnValue <= 0)) {

                returnValue += 180;
            }

        }
        // ***
        return returnValue - 10;
    }
}
