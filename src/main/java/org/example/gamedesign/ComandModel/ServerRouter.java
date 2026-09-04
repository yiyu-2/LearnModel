package org.example.gamedesign.ComandModel;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;
import java.util.function.Supplier;

public class ServerRouter {

    private Map<Integer, Supplier<Command>> routers=new HashMap<>();

    public void register(Integer opCode , Supplier<Command> command){
        routers.put(opCode,command);
    }

    public void dispatch(int opCode,User user){
        Command command = routers.get(opCode).get();
        if(command!=null){
            command.execute(user);
            user.getStack().push(command);
        }
    }

    public void undo(User user){
        Stack<Command> stack = user.getStack();
        if(!stack.isEmpty()){
            Command command = stack.pop();
            command.undo(user);
        }
    }

}
