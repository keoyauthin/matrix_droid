package com.insomniacmath.Animations;


import android.widget.LinearLayout;
import com.insomniacmath.Animator;
import com.insomniacmath.Constants;
import com.insomniacmath.MatrixWrapper;

abstract public class Animation implements Constants {

    protected Animator animator;
    public LinearLayout solvation;
    public MatrixWrapper mW1;

    Animation(Animator animator, LinearLayout solvation, MatrixWrapper parent) {
        this.animator = animator;
        this.solvation = solvation;
        this.mW1 = parent;
    }

    public abstract void tic(int t);

//    solvationString = "" + Utils.round(mW1.m[0][0]) + "*" + Utils.round(mW1.m[1][1]) + " - "
//            + Utils.round(mW1.m[0][1]) + "*" + Utils.round(mW1.m[1][0]);

}
