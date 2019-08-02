package com.qixiafei.book.headfirst.gof.c6;

/**
 * <P>Description: 遥控器. </P>
 * <P>CALLED BY:   齐霞飞 </P>
 * <P>UPDATE BY:   齐霞飞 </P>
 * <P>CREATE AT: 2019/3/11 17:39</P>
 * <P>UPDATE AT: 2019/3/11 17:39</P>
 *
 * @author 齐霞飞
 * @version 1.0
 * @since java 1.8.0
 */
public class RemoteControl {

    private Command[] onCommands;
    private Command[] offCommands;

    public RemoteControl() {
        onCommands = new Command[7];
        offCommands = new Command[7];

        final Command noCommand = new NoCommand();
        for (int i = 0; i < 7; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }

    }

    public void setCommand(int slot, final Command onCommand, final Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPress(int slot) {
        onCommands[slot].execute();
    }

    public void offButtonWasPress(int slot) {
        onCommands[slot].execute();
    }
}
