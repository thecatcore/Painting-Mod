package arthurbambou.paintingmod.items;

import arthurbambou.paintingmod.init.PTMBlocks;
import arthurbambou.paintingmod.init.PTMItems;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class PTMPaintbrush extends PTMItemBase {

	public PTMPaintbrush(String string, CreativeTabs materials) {
		super(string, materials);
		setMaxDamage(0);
		setMaxStackSize(1);
	}
	
	@Override
	public EnumActionResult onItemUse(EntityPlayer player, World worldIn, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
		newbloctopaint(player, worldIn, pos, Blocks.PLANKS, PTMBlocks.BLACK_PLANK, 
				PTMBlocks.RED_PLANK, PTMBlocks.GREEN_PLANK, PTMBlocks.BROWN_PLANK, PTMBlocks.BLUE_PLANK,
				PTMBlocks.PURPLE_PLANK, PTMBlocks.CYAN_PLANK, PTMBlocks.LIGHT_GRAY_PLANK, PTMBlocks.GRAY_PLANK, 
				PTMBlocks.PINK_PLANK, PTMBlocks.LIME_PLANK, PTMBlocks.YELLOW_PLANK, PTMBlocks.LIGHT_BLUE_PLANK,
				PTMBlocks.MAGENTA_PLANK, PTMBlocks.ORANGE_PLANK, PTMBlocks.WHITE_PLANK);
		newbloctopaint(player, worldIn, pos, Blocks.STONE, PTMBlocks.BLACK_STONE, 
				PTMBlocks.RED_STONE, PTMBlocks.GREEN_STONE, PTMBlocks.BROWN_STONE, PTMBlocks.BLUE_STONE,
				PTMBlocks.PURPLE_STONE, PTMBlocks.CYAN_STONE, PTMBlocks.LIGHT_GRAY_STONE, PTMBlocks.GRAY_STONE, 
				PTMBlocks.PINK_STONE, PTMBlocks.LIME_STONE, PTMBlocks.YELLOW_STONE, PTMBlocks.LIGHT_BLUE_STONE,
				PTMBlocks.MAGENTA_STONE, PTMBlocks.ORANGE_STONE, PTMBlocks.WHITE_STONE, 0);
		newbloctopaint(player, worldIn, pos, Blocks.STONE, PTMBlocks.BLACK_GRANITE, 
				PTMBlocks.RED_GRANITE, PTMBlocks.GREEN_GRANITE, PTMBlocks.BROWN_GRANITE, PTMBlocks.BLUE_GRANITE,
				PTMBlocks.PURPLE_GRANITE, PTMBlocks.CYAN_GRANITE, PTMBlocks.LIGHT_GRAY_GRANITE, PTMBlocks.GRAY_GRANITE, 
				PTMBlocks.PINK_GRANITE, PTMBlocks.LIME_GRANITE, PTMBlocks.YELLOW_GRANITE, PTMBlocks.LIGHT_BLUE_GRANITE,
				PTMBlocks.MAGENTA_GRANITE, PTMBlocks.ORANGE_GRANITE, PTMBlocks.WHITE_GRANITE, 1);
		newbloctopaint(player, worldIn, pos, Blocks.STONE, PTMBlocks.BLACK_POLISHED_GRANITE, 
				PTMBlocks.RED_POLISHED_GRANITE, PTMBlocks.GREEN_POLISHED_GRANITE, PTMBlocks.BROWN_POLISHED_GRANITE, PTMBlocks.BLUE_POLISHED_GRANITE,
				PTMBlocks.PURPLE_POLISHED_GRANITE, PTMBlocks.CYAN_POLISHED_GRANITE, PTMBlocks.LIGHT_GRAY_POLISHED_GRANITE, PTMBlocks.GRAY_POLISHED_GRANITE, 
				PTMBlocks.PINK_POLISHED_GRANITE, PTMBlocks.LIME_POLISHED_GRANITE, PTMBlocks.YELLOW_POLISHED_GRANITE, PTMBlocks.LIGHT_BLUE_POLISHED_GRANITE,
				PTMBlocks.MAGENTA_POLISHED_GRANITE, PTMBlocks.ORANGE_POLISHED_GRANITE, PTMBlocks.WHITE_POLISHED_GRANITE, 2);
		newbloctopaint(player, worldIn, pos, Blocks.STONE, PTMBlocks.BLACK_DIORITE, PTMBlocks.RED_DIORITE, PTMBlocks.GREEN_DIORITE, PTMBlocks.BROWN_DIORITE, PTMBlocks.BLUE_DIORITE, PTMBlocks.PURPLE_DIORITE, PTMBlocks.CYAN_DIORITE, PTMBlocks.LIGHT_GRAY_DIORITE, PTMBlocks.GRAY_DIORITE, PTMBlocks.PINK_DIORITE, PTMBlocks.LIME_DIORITE, PTMBlocks.YELLOW_DIORITE, PTMBlocks.LIGHT_BLUE_DIORITE, PTMBlocks.MAGENTA_DIORITE, PTMBlocks.ORANGE_DIORITE, PTMBlocks.WHITE_DIORITE, 3);
		newbloctopaint(player, worldIn, pos, Blocks.STONE, PTMBlocks.BLACK_POLISHED_DIORITE, PTMBlocks.RED_POLISHED_DIORITE, PTMBlocks.GREEN_POLISHED_DIORITE, PTMBlocks.BROWN_POLISHED_DIORITE, PTMBlocks.BLUE_POLISHED_DIORITE, PTMBlocks.PURPLE_POLISHED_DIORITE, PTMBlocks.CYAN_POLISHED_DIORITE, PTMBlocks.LIGHT_GRAY_POLISHED_DIORITE, PTMBlocks.GRAY_POLISHED_DIORITE, PTMBlocks.PINK_POLISHED_DIORITE, PTMBlocks.LIME_POLISHED_DIORITE, PTMBlocks.YELLOW_POLISHED_DIORITE, PTMBlocks.LIGHT_BLUE_POLISHED_DIORITE, PTMBlocks.MAGENTA_POLISHED_DIORITE, PTMBlocks.ORANGE_POLISHED_DIORITE, PTMBlocks.WHITE_POLISHED_DIORITE, 4);
		newbloctopaint(player, worldIn, pos, Blocks.STONE, PTMBlocks.BLACK_ANDESITE, PTMBlocks.RED_ANDESITE, PTMBlocks.GREEN_ANDESITE, PTMBlocks.BROWN_ANDESITE, PTMBlocks.BLUE_ANDESITE, PTMBlocks.PURPLE_ANDESITE, PTMBlocks.CYAN_ANDESITE, PTMBlocks.LIGHT_GRAY_ANDESITE, PTMBlocks.GRAY_ANDESITE, PTMBlocks.PINK_ANDESITE, PTMBlocks.LIME_ANDESITE, PTMBlocks.YELLOW_ANDESITE, PTMBlocks.LIGHT_BLUE_ANDESITE, PTMBlocks.MAGENTA_ANDESITE, PTMBlocks.ORANGE_ANDESITE, PTMBlocks.WHITE_ANDESITE, 5);
		newbloctopaint(player, worldIn, pos, Blocks.STONE, PTMBlocks.BLACK_POLISHED_ANDESITE, PTMBlocks.RED_POLISHED_ANDESITE, PTMBlocks.GREEN_POLISHED_ANDESITE, PTMBlocks.BROWN_POLISHED_ANDESITE, PTMBlocks.BLUE_POLISHED_ANDESITE, PTMBlocks.PURPLE_POLISHED_ANDESITE, PTMBlocks.CYAN_POLISHED_ANDESITE, PTMBlocks.LIGHT_GRAY_POLISHED_ANDESITE, PTMBlocks.GRAY_POLISHED_ANDESITE, PTMBlocks.PINK_POLISHED_ANDESITE, PTMBlocks.LIME_POLISHED_ANDESITE, PTMBlocks.YELLOW_POLISHED_ANDESITE, PTMBlocks.LIGHT_BLUE_POLISHED_ANDESITE, PTMBlocks.MAGENTA_POLISHED_ANDESITE, PTMBlocks.ORANGE_POLISHED_ANDESITE, PTMBlocks.WHITE_POLISHED_ANDESITE, 6);
		newbloctopaint(player, worldIn, pos, Blocks.DIRT, PTMBlocks.BLACK_DIRT, PTMBlocks.RED_DIRT, PTMBlocks.GREEN_DIRT, PTMBlocks.BROWN_DIRT, PTMBlocks.BLUE_DIRT, PTMBlocks.PURPLE_DIRT, PTMBlocks.CYAN_DIRT, PTMBlocks.LIGHT_GRAY_DIRT, PTMBlocks.GRAY_DIRT, PTMBlocks.PINK_DIRT, PTMBlocks.LIME_DIRT, PTMBlocks.YELLOW_DIRT, PTMBlocks.LIGHT_BLUE_DIRT, PTMBlocks.MAGENTA_DIRT, PTMBlocks.ORANGE_DIRT, PTMBlocks.WHITE_DIRT, 0);
		newbloctopaint(player, worldIn, pos, Blocks.DIRT, PTMBlocks.BLACK_COARSE_DIRT, PTMBlocks.RED_COARSE_DIRT, PTMBlocks.GREEN_COARSE_DIRT, PTMBlocks.BROWN_COARSE_DIRT, PTMBlocks.BLUE_COARSE_DIRT, PTMBlocks.PURPLE_COARSE_DIRT, PTMBlocks.CYAN_COARSE_DIRT, PTMBlocks.LIGHT_GRAY_COARSE_DIRT, PTMBlocks.GRAY_COARSE_DIRT, PTMBlocks.PINK_COARSE_DIRT, PTMBlocks.LIME_COARSE_DIRT, PTMBlocks.YELLOW_COARSE_DIRT, PTMBlocks.LIGHT_BLUE_COARSE_DIRT, PTMBlocks.MAGENTA_COARSE_DIRT, PTMBlocks.ORANGE_COARSE_DIRT, PTMBlocks.WHITE_COARSE_DIRT, 1);
		newbloctopaint(player, worldIn, pos, Blocks.COBBLESTONE, PTMBlocks.BLACK_COBBLESTONE, PTMBlocks.RED_COBBLESTONE, PTMBlocks.GREEN_COBBLESTONE, PTMBlocks.BROWN_COBBLESTONE, PTMBlocks.BLUE_COBBLESTONE, PTMBlocks.PURPLE_COBBLESTONE, PTMBlocks.CYAN_COBBLESTONE, PTMBlocks.LIGHT_GRAY_COBBLESTONE, PTMBlocks.GRAY_COBBLESTONE, PTMBlocks.PINK_COBBLESTONE, PTMBlocks.LIME_COBBLESTONE, PTMBlocks.YELLOW_COBBLESTONE, PTMBlocks.LIGHT_BLUE_COBBLESTONE, PTMBlocks.MAGENTA_COBBLESTONE, PTMBlocks.ORANGE_COBBLESTONE, PTMBlocks.WHITE_COBBLESTONE);
		newbloctopaint(player, worldIn, pos, Blocks.SAND, PTMBlocks.BLACK_SAND, PTMBlocks.RED_SAND, PTMBlocks.GREEN_SAND, PTMBlocks.BROWN_SAND, PTMBlocks.BLUE_SAND, PTMBlocks.PURPLE_SAND, PTMBlocks.CYAN_SAND, PTMBlocks.LIGHT_GRAY_SAND, PTMBlocks.GRAY_SAND, PTMBlocks.PINK_SAND, PTMBlocks.LIME_SAND, PTMBlocks.YELLOW_SAND, PTMBlocks.LIGHT_BLUE_SAND, PTMBlocks.MAGENTA_SAND, PTMBlocks.ORANGE_SAND, PTMBlocks.WHITE_SAND);
		newbloctopaint(player, worldIn, pos, Blocks.GRAVEL, PTMBlocks.BLACK_GRAVEL, PTMBlocks.RED_GRAVEL, PTMBlocks.GREEN_GRAVEL, PTMBlocks.BROWN_GRAVEL, PTMBlocks.BLUE_GRAVEL, PTMBlocks.PURPLE_GRAVEL, PTMBlocks.CYAN_GRAVEL, PTMBlocks.LIGHT_GRAY_GRAVEL, PTMBlocks.GRAY_GRAVEL, PTMBlocks.PINK_GRAVEL, PTMBlocks.LIME_GRAVEL, PTMBlocks.YELLOW_GRAVEL, PTMBlocks.LIGHT_BLUE_GRAVEL, PTMBlocks.MAGENTA_GRAVEL, PTMBlocks.ORANGE_GRAVEL, PTMBlocks.WHITE_GRAVEL);
		newbloctopaint(player, worldIn, pos, Blocks.SPONGE, PTMBlocks.BLACK_SPONGE, PTMBlocks.RED_SPONGE, PTMBlocks.GREEN_SPONGE, PTMBlocks.BROWN_SPONGE, PTMBlocks.BLUE_SPONGE, PTMBlocks.PURPLE_SPONGE, PTMBlocks.CYAN_SPONGE, PTMBlocks.LIGHT_GRAY_SPONGE, PTMBlocks.GRAY_SPONGE, PTMBlocks.PINK_SPONGE, PTMBlocks.LIME_SPONGE, PTMBlocks.YELLOW_SPONGE, PTMBlocks.LIGHT_BLUE_SPONGE, PTMBlocks.MAGENTA_SPONGE, PTMBlocks.ORANGE_SPONGE, PTMBlocks.WHITE_SPONGE, 0);
		newbloctopaint(player, worldIn, pos, Blocks.SPONGE, PTMBlocks.BLACK_WET_SPONGE, PTMBlocks.RED_WET_SPONGE, PTMBlocks.GREEN_WET_SPONGE, PTMBlocks.BROWN_WET_SPONGE, PTMBlocks.BLUE_WET_SPONGE, PTMBlocks.PURPLE_WET_SPONGE, PTMBlocks.CYAN_WET_SPONGE, PTMBlocks.LIGHT_GRAY_WET_SPONGE, PTMBlocks.GRAY_WET_SPONGE, PTMBlocks.PINK_WET_SPONGE, PTMBlocks.LIME_WET_SPONGE, PTMBlocks.YELLOW_WET_SPONGE, PTMBlocks.LIGHT_BLUE_WET_SPONGE, PTMBlocks.MAGENTA_WET_SPONGE, PTMBlocks.ORANGE_WET_SPONGE, PTMBlocks.WHITE_WET_SPONGE, 1);
		newbloctopaint(player, worldIn, pos, Blocks.LAPIS_BLOCK, PTMBlocks.BLACK_LAPIS_LAZULI_BLOCK, PTMBlocks.RED_LAPIS_LAZULI_BLOCK, PTMBlocks.GREEN_LAPIS_LAZULI_BLOCK, PTMBlocks.BROWN_LAPIS_LAZULI_BLOCK, PTMBlocks.BLUE_LAPIS_LAZULI_BLOCK, PTMBlocks.PURPLE_LAPIS_LAZULI_BLOCK, PTMBlocks.CYAN_LAPIS_LAZULI_BLOCK, PTMBlocks.LIGHT_GRAY_LAPIS_LAZULI_BLOCK, PTMBlocks.GRAY_LAPIS_LAZULI_BLOCK, PTMBlocks.PINK_LAPIS_LAZULI_BLOCK, PTMBlocks.LIME_LAPIS_LAZULI_BLOCK, PTMBlocks.YELLOW_LAPIS_LAZULI_BLOCK, PTMBlocks.LIGHT_BLUE_LAPIS_LAZULI_BLOCK, PTMBlocks.MAGENTA_LAPIS_LAZULI_BLOCK, PTMBlocks.ORANGE_LAPIS_LAZULI_BLOCK, PTMBlocks.WHITE_LAPIS_LAZULI_BLOCK);
		newbloctopaint(player, worldIn, pos, Blocks.SANDSTONE, PTMBlocks.BLACK_SANDSTONE, PTMBlocks.RED_SANDSTONE, PTMBlocks.GREEN_SANDSTONE, PTMBlocks.BROWN_SANDSTONE, PTMBlocks.BLUE_SANDSTONE, PTMBlocks.PURPLE_SANDSTONE, PTMBlocks.CYAN_SANDSTONE, PTMBlocks.LIGHT_GRAY_SANDSTONE, PTMBlocks.GRAY_SANDSTONE, PTMBlocks.PINK_SANDSTONE, PTMBlocks.LIME_SANDSTONE, PTMBlocks.YELLOW_SANDSTONE, PTMBlocks.LIGHT_BLUE_SANDSTONE, PTMBlocks.MAGENTA_SANDSTONE, PTMBlocks.ORANGE_SANDSTONE, PTMBlocks.WHITE_SANDSTONE, 1);
		newbloctopaint(player, worldIn, pos, Blocks.SANDSTONE, PTMBlocks.BLACK_CHISELED_SANDSTONE, PTMBlocks.RED_CHISELED_SANDSTONE, PTMBlocks.GREEN_CHISELED_SANDSTONE, PTMBlocks.BROWN_CHISELED_SANDSTONE, PTMBlocks.BLUE_CHISELED_SANDSTONE, PTMBlocks.PURPLE_CHISELED_SANDSTONE, PTMBlocks.CYAN_CHISELED_SANDSTONE, PTMBlocks.LIGHT_GRAY_CHISELED_SANDSTONE, PTMBlocks.GRAY_CHISELED_SANDSTONE, PTMBlocks.PINK_CHISELED_SANDSTONE, PTMBlocks.LIME_CHISELED_SANDSTONE, PTMBlocks.YELLOW_CHISELED_SANDSTONE, PTMBlocks.LIGHT_BLUE_CHISELED_SANDSTONE, PTMBlocks.MAGENTA_CHISELED_SANDSTONE, PTMBlocks.ORANGE_CHISELED_SANDSTONE, PTMBlocks.WHITE_CHISELED_SANDSTONE, 1);
		newbloctopaint(player, worldIn, pos, Blocks.SANDSTONE, PTMBlocks.BLACK_SMOOTH_SANDSTONE, PTMBlocks.RED_SMOOTH_SANDSTONE, PTMBlocks.GREEN_SMOOTH_SANDSTONE, PTMBlocks.BROWN_SMOOTH_SANDSTONE, PTMBlocks.BLUE_SMOOTH_SANDSTONE, PTMBlocks.PURPLE_SMOOTH_SANDSTONE, PTMBlocks.CYAN_SMOOTH_SANDSTONE, PTMBlocks.LIGHT_GRAY_SMOOTH_SANDSTONE, PTMBlocks.GRAY_SMOOTH_SANDSTONE, PTMBlocks.PINK_SMOOTH_SANDSTONE, PTMBlocks.LIME_SMOOTH_SANDSTONE, PTMBlocks.YELLOW_SMOOTH_SANDSTONE, PTMBlocks.LIGHT_BLUE_SMOOTH_SANDSTONE, PTMBlocks.MAGENTA_SMOOTH_SANDSTONE, PTMBlocks.ORANGE_SMOOTH_SANDSTONE, PTMBlocks.WHITE_SMOOTH_SANDSTONE, 2);
		newbloctopaint(player, worldIn, pos, Blocks.GOLD_BLOCK, PTMBlocks.BLACK_GOLD_BLOCK, PTMBlocks.RED_GOLD_BLOCK, PTMBlocks.GREEN_GOLD_BLOCK, PTMBlocks.BROWN_GOLD_BLOCK, PTMBlocks.BLUE_GOLD_BLOCK, PTMBlocks.PURPLE_GOLD_BLOCK, PTMBlocks.CYAN_GOLD_BLOCK, PTMBlocks.LIGHT_GRAY_GOLD_BLOCK, PTMBlocks.GRAY_GOLD_BLOCK, PTMBlocks.PINK_GOLD_BLOCK, PTMBlocks.LIME_GOLD_BLOCK, PTMBlocks.YELLOW_GOLD_BLOCK, PTMBlocks.LIGHT_BLUE_GOLD_BLOCK, PTMBlocks.MAGENTA_GOLD_BLOCK, PTMBlocks.ORANGE_GOLD_BLOCK, PTMBlocks.WHITE_GOLD_BLOCK);
		newbloctopaint(player, worldIn, pos, Blocks.IRON_BLOCK, PTMBlocks.BLACK_IRON_BLOCK, PTMBlocks.RED_IRON_BLOCK, PTMBlocks.GREEN_IRON_BLOCK, PTMBlocks.BROWN_IRON_BLOCK, PTMBlocks.BLUE_IRON_BLOCK, PTMBlocks.PURPLE_IRON_BLOCK, PTMBlocks.CYAN_IRON_BLOCK, PTMBlocks.LIGHT_GRAY_IRON_BLOCK, PTMBlocks.GRAY_IRON_BLOCK, PTMBlocks.PINK_IRON_BLOCK, PTMBlocks.LIME_IRON_BLOCK, PTMBlocks.YELLOW_IRON_BLOCK, PTMBlocks.LIGHT_BLUE_IRON_BLOCK, PTMBlocks.MAGENTA_IRON_BLOCK, PTMBlocks.ORANGE_IRON_BLOCK, PTMBlocks.WHITE_IRON_BLOCK);
		newbloctopaint(player, worldIn, pos, Blocks.BRICK_BLOCK, PTMBlocks.BLACK_BRICK, PTMBlocks.RED_BRICK, PTMBlocks.GREEN_BRICK, PTMBlocks.BROWN_BRICK, PTMBlocks.BLUE_BRICK, PTMBlocks.PURPLE_BRICK, PTMBlocks.CYAN_BRICK, PTMBlocks.LIGHT_GRAY_BRICK, PTMBlocks.GRAY_BRICK, PTMBlocks.PINK_BRICK, PTMBlocks.LIME_BRICK, PTMBlocks.YELLOW_BRICK, PTMBlocks.LIGHT_BLUE_BRICK, PTMBlocks.MAGENTA_BRICK, PTMBlocks.ORANGE_BRICK, PTMBlocks.WHITE_BRICK);
		newbloctopaint(player, worldIn, pos, Blocks.MOSSY_COBBLESTONE, PTMBlocks.BLACK_MOSS_STONE, PTMBlocks.RED_MOSS_STONE, PTMBlocks.GREEN_MOSS_STONE, PTMBlocks.BROWN_MOSS_STONE, PTMBlocks.BLUE_MOSS_STONE, PTMBlocks.PURPLE_MOSS_STONE, PTMBlocks.CYAN_MOSS_STONE, PTMBlocks.LIGHT_GRAY_MOSS_STONE, PTMBlocks.GRAY_MOSS_STONE, PTMBlocks.PINK_MOSS_STONE, PTMBlocks.LIME_MOSS_STONE, PTMBlocks.YELLOW_MOSS_STONE, PTMBlocks.LIGHT_BLUE_MOSS_STONE, PTMBlocks.MAGENTA_MOSS_STONE, PTMBlocks.ORANGE_MOSS_STONE, PTMBlocks.WHITE_MOSS_STONE);
		newbloctopaint(player, worldIn, pos, Blocks.OBSIDIAN, PTMBlocks.BLACK_OBSIDIAN, PTMBlocks.RED_OBSIDIAN, PTMBlocks.GREEN_OBSIDIAN, PTMBlocks.BROWN_OBSIDIAN, PTMBlocks.BLUE_OBSIDIAN, PTMBlocks.PURPLE_OBSIDIAN, PTMBlocks.CYAN_OBSIDIAN, PTMBlocks.LIGHT_GRAY_OBSIDIAN, PTMBlocks.GRAY_OBSIDIAN, PTMBlocks.PINK_OBSIDIAN, PTMBlocks.LIME_OBSIDIAN, PTMBlocks.YELLOW_OBSIDIAN, PTMBlocks.LIGHT_BLUE_OBSIDIAN, PTMBlocks.MAGENTA_OBSIDIAN, PTMBlocks.ORANGE_OBSIDIAN, PTMBlocks.WHITE_OBSIDIAN);
		newbloctopaint(player, worldIn, pos, Blocks.DIAMOND_BLOCK, PTMBlocks.BLACK_DIAMOND_BLOCK, PTMBlocks.RED_DIAMOND_BLOCK, PTMBlocks.GREEN_DIAMOND_BLOCK, PTMBlocks.BROWN_DIAMOND_BLOCK, PTMBlocks.BLUE_DIAMOND_BLOCK, PTMBlocks.PURPLE_DIAMOND_BLOCK, PTMBlocks.CYAN_DIAMOND_BLOCK, PTMBlocks.LIGHT_GRAY_DIAMOND_BLOCK, PTMBlocks.GRAY_DIAMOND_BLOCK, PTMBlocks.PINK_DIAMOND_BLOCK, PTMBlocks.LIME_DIAMOND_BLOCK, PTMBlocks.YELLOW_DIAMOND_BLOCK, PTMBlocks.LIGHT_BLUE_DIAMOND_BLOCK, PTMBlocks.MAGENTA_DIAMOND_BLOCK, PTMBlocks.ORANGE_DIAMOND_BLOCK, PTMBlocks.WHITE_DIAMOND_BLOCK);
		newbloctopaint(player, worldIn, pos, Blocks.ICE, PTMBlocks.BLACK_ICE, PTMBlocks.RED_ICE, PTMBlocks.GREEN_ICE, PTMBlocks.BROWN_ICE, PTMBlocks.BLUE_ICE, PTMBlocks.PURPLE_ICE, PTMBlocks.CYAN_ICE, PTMBlocks.LIGHT_GRAY_ICE, PTMBlocks.GRAY_ICE, PTMBlocks.PINK_ICE, PTMBlocks.LIME_ICE, PTMBlocks.YELLOW_ICE, PTMBlocks.LIGHT_BLUE_ICE, PTMBlocks.MAGENTA_ICE, PTMBlocks.ORANGE_ICE, PTMBlocks.WHITE_ICE);
		newbloctopaint(player, worldIn, pos, Blocks.CLAY, PTMBlocks.BLACK_CLAY_BLOCK, PTMBlocks.RED_CLAY_BLOCK, PTMBlocks.GREEN_CLAY_BLOCK, PTMBlocks.BROWN_CLAY_BLOCK, PTMBlocks.BLUE_CLAY_BLOCK, PTMBlocks.PURPLE_CLAY_BLOCK, PTMBlocks.CYAN_CLAY_BLOCK, PTMBlocks.LIGHT_GRAY_CLAY_BLOCK, PTMBlocks.GRAY_CLAY_BLOCK, PTMBlocks.PINK_CLAY_BLOCK, PTMBlocks.LIME_CLAY_BLOCK, PTMBlocks.YELLOW_CLAY_BLOCK, PTMBlocks.LIGHT_BLUE_CLAY_BLOCK, PTMBlocks.MAGENTA_CLAY_BLOCK, PTMBlocks.ORANGE_CLAY_BLOCK, PTMBlocks.WHITE_CLAY_BLOCK);
		newbloctopaint(player, worldIn, pos, Blocks.SNOW, PTMBlocks.BLACK_SNOW_BLOCK, PTMBlocks.RED_SNOW_BLOCK, PTMBlocks.GREEN_SNOW_BLOCK, PTMBlocks.BROWN_SNOW_BLOCK, PTMBlocks.BLUE_SNOW_BLOCK, PTMBlocks.PURPLE_SNOW_BLOCK, PTMBlocks.CYAN_SNOW_BLOCK, PTMBlocks.LIGHT_GRAY_SNOW_BLOCK, PTMBlocks.GRAY_SNOW_BLOCK, PTMBlocks.PINK_SNOW_BLOCK, PTMBlocks.LIME_SNOW_BLOCK, PTMBlocks.YELLOW_SNOW_BLOCK, PTMBlocks.LIGHT_BLUE_SNOW_BLOCK, PTMBlocks.MAGENTA_SNOW_BLOCK, PTMBlocks.ORANGE_SNOW_BLOCK, PTMBlocks.WHITE_SNOW_BLOCK);
		newbloctopaint(player, worldIn, pos, Blocks.NETHERRACK, PTMBlocks.BLACK_NETHERRACK, PTMBlocks.RED_NETHERRACK, PTMBlocks.GREEN_NETHERRACK, PTMBlocks.BROWN_NETHERRACK, PTMBlocks.BLUE_NETHERRACK, PTMBlocks.PURPLE_NETHERRACK, PTMBlocks.CYAN_NETHERRACK, PTMBlocks.LIGHT_GRAY_NETHERRACK, PTMBlocks.GRAY_NETHERRACK, PTMBlocks.PINK_NETHERRACK, PTMBlocks.LIME_NETHERRACK, PTMBlocks.YELLOW_NETHERRACK, PTMBlocks.LIGHT_BLUE_NETHERRACK, PTMBlocks.MAGENTA_NETHERRACK, PTMBlocks.ORANGE_NETHERRACK, PTMBlocks.WHITE_NETHERRACK);
		newbloctopaint(player, worldIn, pos, Blocks.SOUL_SAND, PTMBlocks.BLACK_SOUL_SAND, PTMBlocks.RED_SOUL_SAND, PTMBlocks.GREEN_SOUL_SAND, PTMBlocks.BROWN_SOUL_SAND, PTMBlocks.BLUE_SOUL_SAND, PTMBlocks.PURPLE_SOUL_SAND, PTMBlocks.CYAN_SOUL_SAND, PTMBlocks.LIGHT_GRAY_SOUL_SAND, PTMBlocks.GRAY_SOUL_SAND, PTMBlocks.PINK_SOUL_SAND, PTMBlocks.LIME_SOUL_SAND, PTMBlocks.YELLOW_SOUL_SAND, PTMBlocks.LIGHT_BLUE_SOUL_SAND, PTMBlocks.MAGENTA_SOUL_SAND, PTMBlocks.ORANGE_SOUL_SAND, PTMBlocks.WHITE_SOUL_SAND);
		newbloctopaint(player, worldIn, pos, Blocks.GLOWSTONE, PTMBlocks.BLACK_GLOWSTONE, PTMBlocks.RED_GLOWSTONE, PTMBlocks.GREEN_GLOWSTONE, PTMBlocks.BROWN_GLOWSTONE, PTMBlocks.BLUE_GLOWSTONE, PTMBlocks.PURPLE_GLOWSTONE, PTMBlocks.CYAN_GLOWSTONE, PTMBlocks.LIGHT_GRAY_GLOWSTONE, PTMBlocks.GRAY_GLOWSTONE, PTMBlocks.PINK_GLOWSTONE, PTMBlocks.LIME_GLOWSTONE, PTMBlocks.YELLOW_GLOWSTONE, PTMBlocks.LIGHT_BLUE_GLOWSTONE, PTMBlocks.MAGENTA_GLOWSTONE, PTMBlocks.ORANGE_GLOWSTONE, PTMBlocks.WHITE_GLOWSTONE);
		newbloctopaint(player, worldIn, pos, Blocks.STONEBRICK, PTMBlocks.BLACK_STONE_BRICK, PTMBlocks.RED_STONE_BRICK, PTMBlocks.GREEN_STONE_BRICK, PTMBlocks.BROWN_STONE_BRICK, PTMBlocks.BLUE_STONE_BRICK, PTMBlocks.PURPLE_STONE_BRICK, PTMBlocks.CYAN_STONE_BRICK, PTMBlocks.LIGHT_GRAY_STONE_BRICK, PTMBlocks.GRAY_STONE_BRICK, PTMBlocks.PINK_STONE_BRICK, PTMBlocks.LIME_STONE_BRICK, PTMBlocks.YELLOW_STONE_BRICK, PTMBlocks.LIGHT_BLUE_STONE_BRICK, PTMBlocks.MAGENTA_STONE_BRICK, PTMBlocks.ORANGE_STONE_BRICK, PTMBlocks.WHITE_STONE_BRICK, 0);
		newbloctopaint(player, worldIn, pos, Blocks.STONEBRICK, PTMBlocks.BLACK_CRACKED_STONE_BRICK, PTMBlocks.RED_CRACKED_STONE_BRICK, PTMBlocks.GREEN_CRACKED_STONE_BRICK, PTMBlocks.BROWN_CRACKED_STONE_BRICK, PTMBlocks.BLUE_CRACKED_STONE_BRICK, PTMBlocks.PURPLE_CRACKED_STONE_BRICK, PTMBlocks.CYAN_CRACKED_STONE_BRICK, PTMBlocks.LIGHT_GRAY_CRACKED_STONE_BRICK, PTMBlocks.GRAY_CRACKED_STONE_BRICK, PTMBlocks.PINK_CRACKED_STONE_BRICK, PTMBlocks.LIME_CRACKED_STONE_BRICK, PTMBlocks.YELLOW_CRACKED_STONE_BRICK, PTMBlocks.LIGHT_BLUE_CRACKED_STONE_BRICK, PTMBlocks.MAGENTA_CRACKED_STONE_BRICK, PTMBlocks.ORANGE_CRACKED_STONE_BRICK, PTMBlocks.WHITE_CRACKED_STONE_BRICK, 2);
		newbloctopaint(player, worldIn, pos, Blocks.STONEBRICK, PTMBlocks.BLACK_MOSSY_STONE_BRICK, PTMBlocks.RED_MOSSY_STONE_BRICK, PTMBlocks.GREEN_MOSSY_STONE_BRICK, PTMBlocks.BROWN_MOSSY_STONE_BRICK, PTMBlocks.BLUE_MOSSY_STONE_BRICK, PTMBlocks.PURPLE_MOSSY_STONE_BRICK, PTMBlocks.CYAN_MOSSY_STONE_BRICK, PTMBlocks.LIGHT_GRAY_MOSSY_STONE_BRICK, PTMBlocks.GRAY_MOSSY_STONE_BRICK, PTMBlocks.PINK_MOSSY_STONE_BRICK, PTMBlocks.LIME_MOSSY_STONE_BRICK, PTMBlocks.YELLOW_MOSSY_STONE_BRICK, PTMBlocks.LIGHT_BLUE_MOSSY_STONE_BRICK, PTMBlocks.MAGENTA_MOSSY_STONE_BRICK, PTMBlocks.ORANGE_MOSSY_STONE_BRICK, PTMBlocks.WHITE_MOSSY_STONE_BRICK, 1);
		newbloctopaint(player, worldIn, pos, Blocks.STONEBRICK, PTMBlocks.BLACK_CHISELED_STONE_BRICK, PTMBlocks.RED_CHISELED_STONE_BRICK, PTMBlocks.GREEN_CHISELED_STONE_BRICK, PTMBlocks.BROWN_CHISELED_STONE_BRICK, PTMBlocks.BLUE_CHISELED_STONE_BRICK, PTMBlocks.PURPLE_CHISELED_STONE_BRICK, PTMBlocks.CYAN_CHISELED_STONE_BRICK, PTMBlocks.LIGHT_GRAY_CHISELED_STONE_BRICK, PTMBlocks.GRAY_CHISELED_STONE_BRICK, PTMBlocks.PINK_CHISELED_STONE_BRICK, PTMBlocks.LIME_CHISELED_STONE_BRICK, PTMBlocks.YELLOW_CHISELED_STONE_BRICK, PTMBlocks.LIGHT_BLUE_CHISELED_STONE_BRICK, PTMBlocks.MAGENTA_CHISELED_STONE_BRICK, PTMBlocks.ORANGE_CHISELED_STONE_BRICK, PTMBlocks.WHITE_CHISELED_STONE_BRICK, 3);
		return EnumActionResult.SUCCESS;
	}
	
	public void newbloctopaint(EntityPlayer player, World worldIn, BlockPos pos,
			Block topaint, Block black, Block red, Block green, Block brown, Block blue,
			Block purple, Block cyan, Block lightgray, Block gray, Block pink,
			Block lime, Block yellow, Block lightblue, Block magenta, Block orange, Block white) {
		if (player.getHeldItemMainhand().getItem() == PTMItems.NORMAL_PAINTBRUSH) {
			
		} else {
		if (worldIn.getBlockState(pos).getBlock() == topaint) {
			black(player, worldIn, pos, black);
			red(player, worldIn, pos, red);
			green(player, worldIn, pos, green);
			brown(player, worldIn, pos, brown);
			blue(player, worldIn, pos, blue);
			purple(player, worldIn, pos, purple);
			cyan(player, worldIn, pos, cyan);
			lightGray(player, worldIn, pos, lightgray);
			gray(player, worldIn, pos, gray);
			pink(player, worldIn, pos, pink);
			lime(player, worldIn, pos, lime);
			yellow(player, worldIn, pos, yellow);
			lightBlue(player, worldIn, pos, lightblue);
			magenta(player, worldIn, pos, magenta);
			orange(player, worldIn, pos, orange);
			white(player, worldIn, pos, white);
		}
		}
		
	}
	
	public void newbloctopaint(EntityPlayer player, World worldIn, BlockPos pos,
			Block topaint, Block black, Block red, Block green, Block brown, Block blue,
			Block purple, Block cyan, Block lightgray, Block gray, Block pink,
			Block lime, Block yellow, Block lightblue, Block magenta, Block orange, Block white, int meta) {
		if (player.getHeldItemMainhand().getItem() == PTMItems.NORMAL_PAINTBRUSH) {
			
		} else {
		if (worldIn.getBlockState(pos).getBlock() == topaint && worldIn.getBlockState(pos).getBlock().getMetaFromState(worldIn.getBlockState(pos)) == meta) {
			black(player, worldIn, pos, black);
			red(player, worldIn, pos, red);
			green(player, worldIn, pos, green);
			brown(player, worldIn, pos, brown);
			blue(player, worldIn, pos, blue);
			purple(player, worldIn, pos, purple);
			cyan(player, worldIn, pos, cyan);
			lightGray(player, worldIn, pos, lightgray);
			gray(player, worldIn, pos, gray);
			pink(player, worldIn, pos, pink);
			lime(player, worldIn, pos, lime);
			yellow(player, worldIn, pos, yellow);
			lightBlue(player, worldIn, pos, lightblue);
			magenta(player, worldIn, pos, magenta);
			orange(player, worldIn, pos, orange);
			white(player, worldIn, pos, white);
		}
		}
	}
	
	public void usedpaintbrush (EntityPlayer player) {
		player.getHeldItemMainhand().shrink(1);
		player.inventory.addItemStackToInventory(new ItemStack(PTMItems.NORMAL_PAINTBRUSH));
	}
	
	public void black (EntityPlayer player, World worldIn, BlockPos pos, Block item) {
		if (player.getHeldItemMainhand().getItem() == PTMItems.BLACK_PAINTBRUSH) {
			worldIn.setBlockState(pos, item.getDefaultState());
			usedpaintbrush(player);
		}
	}
	
	public void red (EntityPlayer player, World worldIn, BlockPos pos, Block item) {
		if (player.getHeldItemMainhand().getItem() == PTMItems.RED_PAINTBRUSH) {
			worldIn.setBlockState(pos, item.getDefaultState());
			usedpaintbrush(player);
		}
	}
	
	public void green (EntityPlayer player, World worldIn, BlockPos pos, Block item) {
		if (player.getHeldItemMainhand().getItem() == PTMItems.GREEN_PAINTBRUSH) {
			worldIn.setBlockState(pos, item.getDefaultState());
			usedpaintbrush(player);
		}
	}
	
	public void brown (EntityPlayer player, World worldIn, BlockPos pos, Block item) {
		if (player.getHeldItemMainhand().getItem() == PTMItems.BROWN_PAINTBRUSH) {
			worldIn.setBlockState(pos, item.getDefaultState());
			usedpaintbrush(player);
		}
	}
	
	public void blue (EntityPlayer player, World worldIn, BlockPos pos, Block item) {
		if (player.getHeldItemMainhand().getItem() == PTMItems.BLUE_PAINTBRUSH) {
			worldIn.setBlockState(pos, item.getDefaultState());
			usedpaintbrush(player);
		}
	}
	
	public void purple (EntityPlayer player, World worldIn, BlockPos pos, Block item) {
		if (player.getHeldItemMainhand().getItem() == PTMItems.PURPLE_PAINTBRUSH) {
			worldIn.setBlockState(pos, item.getDefaultState());
			usedpaintbrush(player);
		}
	}
	
	public void cyan (EntityPlayer player, World worldIn, BlockPos pos, Block item) {
		if (player.getHeldItemMainhand().getItem() == PTMItems.CYAN_PAINTBRUSH) {
			worldIn.setBlockState(pos, item.getDefaultState());
			usedpaintbrush(player);
		}
	}
	
	public void lightGray (EntityPlayer player, World worldIn, BlockPos pos, Block item) {
		if (player.getHeldItemMainhand().getItem() == PTMItems.LIGHT_GRAY_PAINTBRUSH) {
			worldIn.setBlockState(pos, item.getDefaultState());
			usedpaintbrush(player);
		}
	}
	
	public void gray (EntityPlayer player, World worldIn, BlockPos pos, Block item) {
		if (player.getHeldItemMainhand().getItem() == PTMItems.GRAY_PAINTBRUSH) {
			worldIn.setBlockState(pos, item.getDefaultState());
			usedpaintbrush(player);
		}
	}
	
	public void pink (EntityPlayer player, World worldIn, BlockPos pos, Block item) {
		if (player.getHeldItemMainhand().getItem() == PTMItems.PINK_PAINTBRUSH) {
			worldIn.setBlockState(pos, item.getDefaultState());
			usedpaintbrush(player);
		}
	}
	
	public void lime (EntityPlayer player, World worldIn, BlockPos pos, Block item) {
		if (player.getHeldItemMainhand().getItem() == PTMItems.LIME_PAINTBRUSH) {
			worldIn.setBlockState(pos, item.getDefaultState());
			usedpaintbrush(player);
		}
	}
	
	public void yellow (EntityPlayer player, World worldIn, BlockPos pos, Block item) {
		if (player.getHeldItemMainhand().getItem() == PTMItems.YELLOW_PAINTBRUSH) {
			worldIn.setBlockState(pos, item.getDefaultState());
			usedpaintbrush(player);
		}
	}
	
	public void lightBlue (EntityPlayer player, World worldIn, BlockPos pos, Block item) {
		if (player.getHeldItemMainhand().getItem() == PTMItems.LIGHT_BLUE_PAINTBRUSH) {
			worldIn.setBlockState(pos, item.getDefaultState());
			usedpaintbrush(player);
		}
	}
	
	public void magenta (EntityPlayer player, World worldIn, BlockPos pos, Block item) {
		if (player.getHeldItemMainhand().getItem() == PTMItems.MAGENTA_PAINTBRUSH) {
			worldIn.setBlockState(pos, item.getDefaultState());
			usedpaintbrush(player);
		}
	}
	
	public void orange (EntityPlayer player, World worldIn, BlockPos pos, Block item) {
		if (player.getHeldItemMainhand().getItem() == PTMItems.ORANGE_PAINTBRUSH) {
			worldIn.setBlockState(pos, item.getDefaultState());
			usedpaintbrush(player);
		}
	}
	
	public void white (EntityPlayer player, World worldIn, BlockPos pos, Block item) {
		if (player.getHeldItemMainhand().getItem() == PTMItems.WHITE_PAINTBRUSH) {
			worldIn.setBlockState(pos, item.getDefaultState());
			usedpaintbrush(player);
		}
	}
}
