package fr.knil.monpremiermod.item.custom;


import net.minecraft.item.Item;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.util.ActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class magic_stick extends Item {

	public magic_stick(Settings settings) {
		super(settings);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public ActionResult useOnBlock(ItemUsageContext context) {
		World world = context.getWorld();
        BlockPos pos = context.getBlockPos();

        // Vérifie si on est du côté serveur pour éviter les doublons
        if (!world.isClient()) {
            // Remplace le bloc cliqué par de l'air
            world.setBlockState(pos, net.minecraft.block.Blocks.GOLD_BLOCK.getDefaultState());
        }

        // Retourne SUCCESS pour indiquer que l'action a réussi et consommer l'item (si applicable)
        return ActionResult.SUCCESS;		

       
	}
	
	
	
}