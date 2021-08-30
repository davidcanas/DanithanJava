package com.canasdev.danithan;

import com.canasdev.danithan.commands.pingCommand;
import com.canasdev.danithan.commands.testCommand;
import com.canasdev.danithan.listeners.readylistener;
import com.jagrosh.jdautilities.command.CommandClient;
import com.jagrosh.jdautilities.command.CommandClientBuilder;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.requests.GatewayIntent;

import net.dv8tion.jda.api.utils.cache.CacheFlag;

import javax.security.auth.login.LoginException;
import java.net.UnknownHostException;
import java.util.EnumSet;

public class DaniClient {


    public static void main(String[] args) throws LoginException, UnknownHostException {

        MongoClient mongoClient = new MongoClient(new MongoClientURI("mongodb://DanithanBot:david2021@danicluster.rkt3t.mongodb.net/Database?retryWrites=true&w=majority"));

        CommandClientBuilder builder = new CommandClientBuilder();

        // Set your bot's prefix
        builder.setPrefix("d_");


        // Add commands

        builder.addCommands(new pingCommand(), new testCommand());
        builder.setActivity(null);
        builder.useHelpBuilder(false);
        builder.setOwnerId("791347446298312724");
        CommandClient clientUtil = builder.build();

        JDA client = (JDA) JDABuilder.createDefault("ODI5OTcxMjU0MjY5ODM3MzQ0.YG_49w.B4aGHvcjS8nHZj-FRy9GvjRST7Q",
                        GatewayIntent.GUILD_MEMBERS,
                        GatewayIntent.GUILD_MESSAGES,
                        GatewayIntent.GUILD_VOICE_STATES).disableCache(EnumSet.of(
                        CacheFlag.CLIENT_STATUS,
                        CacheFlag.ACTIVITY,
                        CacheFlag.EMOTE
                )).enableCache(CacheFlag.VOICE_STATE)
                .addEventListeners(new readylistener(), clientUtil).setActivity(Activity.playing("Danithan em java hmmmm")).build();

   }
}


