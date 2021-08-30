package com.canasdev.danithan.commands;

import java.time.temporal.ChronoUnit;
import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;
import com.jagrosh.jdautilities.doc.standard.CommandInfo;
import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.entities.MessageEmbed;
import net.dv8tion.jda.api.events.interaction.SlashCommandEvent;

@CommandInfo(
        name = {"test", "test"},
        description = "Checks the bot's test"
)

public class testCommand extends Command {



    public testCommand()
    {
        this.name = "help";
        this.help = "Vê add latencia do bot";
        this.guildOnly = false;
        this.aliases = new String[]{"teste"};
    }

    @Override
    protected void execute(CommandEvent event) {
      EmbedBuilder embed = new EmbedBuilder()
               .setTitle(String.format("Olá %s eu sou o DanithanJaveiro", event.getAuthor().getName()))
              .setDescription(String.format("O meu prefixo neste servidor é %s\nComandos: `help, ping`", event.getPrefix()));
        event.getChannel().sendMessage(embed.build()).queue();
    }

}
