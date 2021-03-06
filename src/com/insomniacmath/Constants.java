package com.insomniacmath;

import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

/**
 * this class was made
 * by insomniac and angryded
 * for their purposes
 */
public interface Constants {

    public static final int MAX_SIZE = 10; //todo

    int STATE_INITIAL = 0;
    int STATE_DETERMIN_PRESSED = 1;
    int STATE_DETERMIN_EXPLAINING = 2;
    int STATE_DETERMIN_EXPLAINED = 3;
    int STATE_MULTIPLY_PRESSED = 4;
    int STATE_MULTIPLY_FIND = 5;
    int STATE_MULTIPLY_EXPLAINING = 6;
    int STATE_MULTIPLY_EXPLAINED = 7;
    int STATE_INVERT_FIND = 8;
    int STATE_INVERT_EXPLAINING = 9;
    int STATE_INVERT_EXPLAINED = 10;
    int STATE_RANG_FIND = 11;
    int STATE_RANG_EXPLAINING = 12;
    int STATE_RANG_EXPLAINED = 13;
    int STATE_SIDE_COLUMN_ADDED = 14;
    int STATE_SYSTEM_SOLVED = 15;
    int STATE_SYSTEM_EXPLAINING_GAUS = 16;
    int STATE_SYSTEM_EXPLAINING_CRAMER = 17;
    int STATE_SYSTEM_EXPLAINING_INVERT = 18;
    int STATE_SYSTEM_EXPLAINED = 19;

    int INIT_SIZE = 2;

    int DOWN = 0;
    int UP = 1;
    int LEFT = 2;
    int RIGHT = 3;

    final static int cyan = 0xAA3388FF;
    final static int viol = 0xAA8833FF;
    final static int ros = 0xAAFF3388;
    final static int blu = 0xAA2233FF;
    final static int gree = 0xAA22FF22;
    final static int yel = 0xAAFF8800;


    int VIEW_IDS = 500;
    int BODY_ID = VIEW_IDS + 1;
    int RESULT_ID = VIEW_IDS + 2;

    int PLUS_COLUMN_ID = VIEW_IDS + 12;
    int MINUS_COLUMN_ID = VIEW_IDS + 13;
    int PLUS_ROW_ID = VIEW_IDS + 14;
    int MINUS_ROW_ID = VIEW_IDS + 15;

    int[] colors = new int[]{cyan, viol, ros, blu, gree, yel};


}
