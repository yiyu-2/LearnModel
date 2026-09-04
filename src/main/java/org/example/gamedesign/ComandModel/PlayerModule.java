package org.example.gamedesign.ComandModel;

public class PlayerModule implements ServerModule{
    @Override
    public void init(ServerRouter serverRouter) {
        serverRouter.register(1001,()->new addHpCommand());
    }
}
