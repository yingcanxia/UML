package cn.shadow.uml.responsibilityChain.handler;

import cn.shadow.uml.responsibilityChain.Leave.ILeave;

public interface IHandler {
    void handleLeave(ILeave leave);
}
