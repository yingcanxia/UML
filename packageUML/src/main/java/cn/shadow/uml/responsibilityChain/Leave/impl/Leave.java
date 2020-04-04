package cn.shadow.uml.responsibilityChain.Leave.impl;

import cn.shadow.uml.responsibilityChain.Leave.ILeave;

public class Leave implements ILeave {
    private String name;
    private int leaveDays;
    private String content;

    public Leave(String name, int leaveDays, String content) {
        this.name = name;
        this.leaveDays = leaveDays;
        this.content = content;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getDays() {
        return leaveDays;
    }

    @Override
    public String getContent() {
        return content;
    }
}
