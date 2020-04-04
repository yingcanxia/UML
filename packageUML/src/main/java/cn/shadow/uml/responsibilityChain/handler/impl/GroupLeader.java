package cn.shadow.uml.responsibilityChain.handler.impl;

import cn.shadow.uml.responsibilityChain.Leave.ILeave;
import cn.shadow.uml.responsibilityChain.handler.IHandler;
import cn.shadow.uml.responsibilityChain.handler.abs.Handler;

public class GroupLeader extends Handler {

    public GroupLeader() {
        //小组长处理1-3天的请假
        super(Handler.NUM_ONE, Handler.NUM_THREE);
    }
    @Override
    protected void handleLeave(ILeave leave) {
        System.out.println(leave.getName()+"请"+leave.getDays()+"天假，请假原因："+leave.getContent());
        System.out.println("小组长同意");
    }
    /*@Override
    public void handleLeave(ILeave leave) {
        System.out.println(leave.getName()+"请"+leave.getDays()+"天假，请假原因："+leave.getContent());
        System.out.println("小组长同意");
    }*/
}
