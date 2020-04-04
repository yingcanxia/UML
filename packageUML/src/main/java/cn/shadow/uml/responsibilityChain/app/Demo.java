package cn.shadow.uml.responsibilityChain.app;

import cn.shadow.uml.responsibilityChain.Leave.impl.Leave;
import cn.shadow.uml.responsibilityChain.handler.abs.Handler;
import cn.shadow.uml.responsibilityChain.handler.impl.GroupLeader;
import cn.shadow.uml.responsibilityChain.handler.impl.Manager;

public class Demo {
    public static void main(String[] args) {

    }
    private static void plainA(){
       /* Leave leave=new Leave("小明",10,"家里出事了");
        if(leave.getDays()<3){
            GroupLeader groupLeader=new GroupLeader();
            groupLeader.handleLeave(leave);
        }
        if(3<leave.getDays()&&leave.getDays()<7){
            Manager manager=new Manager();
            manager.handleLeave(leave);
        }*/
    }
    private static void plainB(){
        Leave leave=new Leave("小明",10,"家里出事了");
        Handler groupLeader = new GroupLeader();
        Handler manager = new Manager();
        groupLeader.setNextHandler(manager);//小组长的领导是部门经理
        //提交申请
        groupLeader.submit(leave);
    }
}
