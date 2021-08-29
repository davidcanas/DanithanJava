package com.canasdev.danithan.commands;

import java.time.temporal.ChronoUnit;
import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;
import com.jagrosh.jdautilities.doc.standard.CommandInfo;
import com.jagrosh.jdautilities.examples.doc.Author;

    /**
     *
     * @author John Grosh (jagrosh)
     */
    @CommandInfo(
            name = {"Ping", "Pong"},
            description = "Checks the bot's latency"
    )
    @Author("John Grosh (jagrosh)")
    public class pingCommand extends Command {

        public pingCommand()
        {
            this.name = "ping";
            this.help = "Vê a latencia do bot";
            this.guildOnly = false;
            this.aliases = new String[]{"pong"};
        }

        @Override
        protected void execute(CommandEvent event) {
            event.reply("Ping: ...", m -> {
                long ping = event.getMessage().getTimeCreated().until(m.getTimeCreated(), ChronoUnit.MILLIS);
                m.editMessage("Ping: " + ping  + "ms | Websocket: " + event.getJDA().getGatewayPing() + "ms").queue();
            });
        }

    }

