package com.heiden.droolsdemo.entity;

public class RuleResult {
    private boolean postCodeResult = false;

    public boolean isPostCodeResult(){
        return postCodeResult;
    }

    public void setPostCodeResult(boolean postCodeResult) {
        this.postCodeResult = postCodeResult;
    }
}
