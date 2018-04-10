package com.example.hp.kilimo_bora;

/**
 * Created by hp on 21/03/2018.
 */

public class MainData {

    public MainData(){}


    public abstract class MainDataInfo {

        public static final String DATABASE_NAME = "CROPS";
        public static final String TABLE1_NAME="Cereals";
        public static final String TABLE2_NAME="Tubers";
        public static final String TABLE3_NAME="Legumes";
        public static final int DATABASE_VERSION=1;
        public static final String CEREAL_TYPE="type";
        public static final String REGIONS_GROWN="region";
        public static final String DISEASES="diseases";

    }
}
