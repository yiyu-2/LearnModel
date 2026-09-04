package org.example.gamedesign.ComandModel;

import java.util.ArrayList;
import java.util.List;

public class GameServer {
    public static void main(String[] args){
        ServerRouter router = new ServerRouter();
        List<ServerModule> modules=new ArrayList<>();
        modules.add(new PlayerModule());

        for(ServerModule module : modules){
            module.init(router);
        }

        User user=new User();
        router.dispatch(1001,user);
    }
}
