package cn.shadow.uml.responsibilityChain.handler.impl;

import cn.shadow.uml.responsibilityChain.Leave.ILeave;
import cn.shadow.uml.responsibilityChain.handler.abs.Handler;

public class Manager extends Handler {

    public Manager() {
        super(Handler.NUM_THREE, Handler.NUM_SEVEN);
    }

    @Override
    public void handleLeave(ILeave leave) {
        System.out.println(leave.getName() + "请假" + leave.getDays() + "天," + leave.getContent() + "。");
        System.out.println("总经理审批：同意。");
    }
}
