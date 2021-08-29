package com.canasdev.danithan.listeners;

import net.dv8tion.jda.api.events.GenericEvent;
import net.dv8tion.jda.api.events.ReadyEvent;
import net.dv8tion.jda.api.hooks.EventListener;

public class readylistener implements EventListener
{

    @Override
    public void onEvent(GenericEvent event)
    {
       var client = event.getJDA();

       System.out.println(client.getSelfUser().getName());
        if (event instanceof ReadyEvent)
            System.out.println("Danithan Iniciado com Sucesso");
    }
}
