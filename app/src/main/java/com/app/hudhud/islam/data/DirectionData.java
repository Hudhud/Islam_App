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

package com.app.hudhud.islam.data;

public class DirectionData {
    private double northDirectionFromDeviceHead;
    private double targetDirectionFromNorth;

    public double getNorthDirectionFromDeviceHead() {
        return northDirectionFromDeviceHead;
    }

    public void setNorthDirectionFromDeviceHead(double northDirectionDegree) {
        this.northDirectionFromDeviceHead = northDirectionDegree;
    }

    public double getTargetDirectionFromNorth() {
        return targetDirectionFromNorth;
    }

    public void setTargetDirectionFromNorth(double targetDirectionFromNorth) {
        this.targetDirectionFromNorth = targetDirectionFromNorth;
    }
    
    public double getTargetDirectionFromDeviceHead(){
        return this.northDirectionFromDeviceHead +this.targetDirectionFromNorth;
    }

    public DirectionData(double northDirectionFromDeviceHead,
                         double targetDirectionFromNorth) {
        super();
        this.northDirectionFromDeviceHead = northDirectionFromDeviceHead;
        this.targetDirectionFromNorth = targetDirectionFromNorth;
    }

}
