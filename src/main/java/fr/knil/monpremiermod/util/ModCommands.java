package fr.knil.monpremiermod.util;

import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.context.CommandContext;

import net.fabricmc.fabric.api.command.v2.CommandRegistrationCallback;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.server.command.CommandManager;
import net.minecraft.server.command.ServerCommandSource;
import net.minecraft.text.Text;

public class ModCommands {
	public static void registerCommands() {
        // Enregistrer les commandes lors de l'initialisation
        CommandRegistrationCallback.EVENT.register((dispatcher, registryAccess, environment) -> {
            dispatcher.register(CommandManager.literal("hello") // Nom de la commande
                .executes(ModCommands::sayHello)); // Méthode appelée quand la commande est exécutée
            
            dispatcher.register(CommandManager.literal("add") // Nom de la commande
                .then(CommandManager.argument("number", IntegerArgumentType.integer()) // Argument entier
                .executes(ModCommands::addNumber)));
        });
    }

    private static int sayHello(CommandContext<ServerCommandSource> context) {
    	PlayerEntity player = context.getSource().getPlayer();
    	
    	player.sendMessage(Text.literal("Hello world !"));

        return 1; // Retourne un succès
    }

    private static int addNumber(CommandContext<ServerCommandSource> context) {
        int number = IntegerArgumentType.getInteger(context, "number");
        PlayerEntity player = context.getSource().getPlayer();
    	player.sendMessage(Text.literal("You entered: §e" + number));
        return number; // Retourne la valeur entrée
    }
}
