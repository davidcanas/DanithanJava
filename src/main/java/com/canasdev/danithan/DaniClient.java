package com.canasdev.danithan;

import com.canasdev.danithan.listeners.readylistener;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.requests.GatewayIntent;

import net.dv8tion.jda.api.utils.cache.CacheFlag;

import javax.security.auth.login.LoginException;
import java.util.EnumSet;

public class DaniClient {


   public static void main(String[] args) throws LoginException {

      JDA client = JDABuilder.createDefault("ODI5OTcxMjU0MjY5ODM3MzQ0.YG_49w.B4aGHvcjS8nHZj-FRy9GvjRST7Q",
                      GatewayIntent.GUILD_MEMBERS,
                      GatewayIntent.GUILD_MESSAGES,
                      GatewayIntent.GUILD_VOICE_STATES).disableCache(EnumSet.of(
                      CacheFlag.CLIENT_STATUS,
                      CacheFlag.ACTIVITY,
                      CacheFlag.EMOTE
              )).enableCache(CacheFlag.VOICE_STATE)
              .addEventListeners(new readylistener()).setActivity(Activity.playing("Danithan em java hmmmm"))
              .build();


   }
}


