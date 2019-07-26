package fr.arthurbambou.paintingmod.mainmod;

import com.swordglowsblue.artifice.api.Artifice;
import fr.arthurbambou.paintingmod.mainmod.api.ColoredObject;
import net.fabricmc.api.ClientModInitializer;
import net.minecraft.block.Block;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.StairsBlock;
import net.minecraft.util.Identifier;

import static fr.arthurbambou.paintingmod.mainmod.registery.ModBlocks.COLORED_BLOCKS;

public class PaintingModClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        Artifice.registerAssets(new Identifier(PaintingMod.MODID, "default_pack"), pack -> {
            for (ColoredObject coloredBlock : COLORED_BLOCKS) {
                for (Block block : coloredBlock.getArrayList()) {
                    Identifier id = new Identifier(PaintingMod.MODID, block.getTranslationKey().replace("block.paintingmod.", ""));
                    if (block instanceof SlabBlock) {
                        pack.addBlockState(id, blockStateBuilder -> {
                            blockStateBuilder.variant("type=bottom", variant -> {
                                variant.model(new Identifier(id.getNamespace(), "block/" + id.getPath()));
                            });
                            blockStateBuilder.variant("type=top", variant -> {
                                variant.model(new Identifier(id.getNamespace(), "block/" + id.getPath() + "_top"));
                            });
                            blockStateBuilder.variant("type=double", variant -> {
                                variant.model(new Identifier(id.getNamespace(), "block/" + id.getPath().replace("_slab", "")));
                            });
                        });
                    } else {
                        if (block instanceof StairsBlock) {
                            pack.addBlockState(id, blockStateBuilder -> {
                                blockStateBuilder.variant("facing=east,half=bottom,shape=straight", variant -> {
                                    variant.model(new Identifier(id.getNamespace(), "block/" + id.getPath()));
                                });
                                blockStateBuilder.variant("facing=west,half=bottom,shape=straight", variant -> {
                                    variant.model(new Identifier(id.getNamespace(), "block/" + id.getPath()));
                                    variant.rotationY(180);
                                    variant.uvlock(true);
                                });
                                blockStateBuilder.variant("facing=south,half=bottom,shape=straight", variant -> {
                                    variant.model(new Identifier(id.getNamespace(), "block/" + id.getPath()));
                                    variant.rotationY(90);
                                    variant.uvlock(true);
                                });
                                blockStateBuilder.variant("facing=north,half=bottom,shape=straight", variant -> {
                                    variant.model(new Identifier(id.getNamespace(), "block/" + id.getPath()));
                                    variant.rotationY(270);
                                    variant.uvlock(true);
                                });

                                blockStateBuilder.variant("facing=east,half=bottom,shape=outer_right", variant -> {
                                    variant.model(new Identifier(id.getNamespace(), "block/" + id.getPath() + "_outer"));
                                });
                                blockStateBuilder.variant("facing=west,half=bottom,shape=outer_right", variant -> {
                                    variant.model(new Identifier(id.getNamespace(), "block/" + id.getPath() + "_outer"));
                                    variant.rotationY(180);
                                    variant.uvlock(true);
                                });
                                blockStateBuilder.variant("facing=south,half=bottom,shape=outer_right", variant -> {
                                    variant.model(new Identifier(id.getNamespace(), "block/" + id.getPath() + "_outer"));
                                    variant.rotationY(90);
                                    variant.uvlock(true);
                                });
                                blockStateBuilder.variant("facing=north,half=bottom,shape=outer_right", variant -> {
                                    variant.model(new Identifier(id.getNamespace(), "block/" + id.getPath() + "_outer"));
                                    variant.rotationY(270);
                                    variant.uvlock(true);
                                });

                                blockStateBuilder.variant("facing=south,half=bottom,shape=outer_left", variant -> {
                                    variant.model(new Identifier(id.getNamespace(), "block/" + id.getPath() + "_outer"));
                                });
                                blockStateBuilder.variant("facing=north,half=bottom,shape=outer_left", variant -> {
                                    variant.model(new Identifier(id.getNamespace(), "block/" + id.getPath() + "_outer"));
                                    variant.rotationY(180);
                                    variant.uvlock(true);
                                });
                                blockStateBuilder.variant("facing=west,half=bottom,shape=outer_left", variant -> {
                                    variant.model(new Identifier(id.getNamespace(), "block/" + id.getPath() + "_outer"));
                                    variant.rotationY(90);
                                    variant.uvlock(true);
                                });
                                blockStateBuilder.variant("facing=east,half=bottom,shape=outer_left", variant -> {
                                    variant.model(new Identifier(id.getNamespace(), "block/" + id.getPath() + "_outer"));
                                    variant.rotationY(270);
                                    variant.uvlock(true);
                                });

                                blockStateBuilder.variant("facing=east,half=bottom,shape=inner_right", variant -> {
                                    variant.model(new Identifier(id.getNamespace(), "block/" + id.getPath() + "_inner"));
                                });
                                blockStateBuilder.variant("facing=west,half=bottom,shape=inner_right", variant -> {
                                    variant.model(new Identifier(id.getNamespace(), "block/" + id.getPath() + "_inner"));
                                    variant.rotationY(180);
                                    variant.uvlock(true);
                                });
                                blockStateBuilder.variant("facing=south,half=bottom,shape=inner_right", variant -> {
                                    variant.model(new Identifier(id.getNamespace(), "block/" + id.getPath() + "_inner"));
                                    variant.rotationY(90);
                                    variant.uvlock(true);
                                });
                                blockStateBuilder.variant("facing=north,half=bottom,shape=inner_right", variant -> {
                                    variant.model(new Identifier(id.getNamespace(), "block/" + id.getPath() + "_inner"));
                                    variant.rotationY(270);
                                    variant.uvlock(true);
                                });

                                blockStateBuilder.variant("facing=south,half=bottom,shape=inner_left", variant -> {
                                    variant.model(new Identifier(id.getNamespace(), "block/" + id.getPath() + "_inner"));
                                });
                                blockStateBuilder.variant("facing=north,half=bottom,shape=inner_left", variant -> {
                                    variant.model(new Identifier(id.getNamespace(), "block/" + id.getPath() + "_inner"));
                                    variant.rotationY(180);
                                    variant.uvlock(true);
                                });
                                blockStateBuilder.variant("facing=west,half=bottom,shape=inner_left", variant -> {
                                    variant.model(new Identifier(id.getNamespace(), "block/" + id.getPath() + "_inner"));
                                    variant.rotationY(90);
                                    variant.uvlock(true);
                                });
                                blockStateBuilder.variant("facing=east,half=bottom,shape=inner_left", variant -> {
                                    variant.model(new Identifier(id.getNamespace(), "block/" + id.getPath() + "_inner"));
                                    variant.rotationY(270);
                                    variant.uvlock(true);
                                });



                                blockStateBuilder.variant("facing=east,half=top,shape=straight", variant -> {
                                    variant.model(new Identifier(id.getNamespace(), "block/" + id.getPath()));
                                    variant.rotationX(180);
                                    variant.uvlock(true);
                                });
                                blockStateBuilder.variant("facing=west,half=top,shape=straight", variant -> {
                                    variant.model(new Identifier(id.getNamespace(), "block/" + id.getPath()));
                                    variant.rotationY(180);
                                    variant.uvlock(true);
                                    variant.rotationX(180);
                                });
                                blockStateBuilder.variant("facing=south,half=top,shape=straight", variant -> {
                                    variant.model(new Identifier(id.getNamespace(), "block/" + id.getPath()));
                                    variant.rotationY(90);
                                    variant.uvlock(true);
                                    variant.rotationX(180);
                                });
                                blockStateBuilder.variant("facing=north,half=top,shape=straight", variant -> {
                                    variant.model(new Identifier(id.getNamespace(), "block/" + id.getPath()));
                                    variant.rotationY(270);
                                    variant.uvlock(true);
                                    variant.rotationX(180);
                                });

                                blockStateBuilder.variant("facing=east,half=top,shape=outer_left", variant -> {
                                    variant.model(new Identifier(id.getNamespace(), "block/" + id.getPath() + "_outer"));
                                    variant.rotationX(180);
                                    variant.uvlock(true);
                                });
                                blockStateBuilder.variant("facing=west,half=top,shape=outer_left", variant -> {
                                    variant.model(new Identifier(id.getNamespace(), "block/" + id.getPath() + "_outer"));
                                    variant.rotationY(180);
                                    variant.uvlock(true);
                                    variant.rotationX(180);
                                });
                                blockStateBuilder.variant("facing=south,half=top,shape=outer_left", variant -> {
                                    variant.model(new Identifier(id.getNamespace(), "block/" + id.getPath() + "_outer"));
                                    variant.rotationY(90);
                                    variant.uvlock(true);
                                    variant.rotationX(180);
                                });
                                blockStateBuilder.variant("facing=north,half=top,shape=outer_left", variant -> {
                                    variant.model(new Identifier(id.getNamespace(), "block/" + id.getPath() + "_outer"));
                                    variant.rotationY(270);
                                    variant.uvlock(true);
                                    variant.rotationX(180);
                                });

                                blockStateBuilder.variant("facing=south,half=top,shape=outer_right", variant -> {
                                    variant.model(new Identifier(id.getNamespace(), "block/" + id.getPath() + "_outer"));
                                    variant.rotationX(180);
                                    variant.uvlock(true);
                                });
                                blockStateBuilder.variant("facing=north,half=top,shape=outer_right", variant -> {
                                    variant.model(new Identifier(id.getNamespace(), "block/" + id.getPath() + "_outer"));
                                    variant.rotationY(180);
                                    variant.uvlock(true);
                                    variant.rotationX(180);
                                });
                                blockStateBuilder.variant("facing=west,half=top,shape=outer_right", variant -> {
                                    variant.model(new Identifier(id.getNamespace(), "block/" + id.getPath() + "_outer"));
                                    variant.rotationY(90);
                                    variant.uvlock(true);
                                    variant.rotationX(180);
                                });
                                blockStateBuilder.variant("facing=east,half=top,shape=outer_right", variant -> {
                                    variant.model(new Identifier(id.getNamespace(), "block/" + id.getPath() + "_outer"));
                                    variant.rotationY(270);
                                    variant.uvlock(true);
                                    variant.rotationX(180);
                                });

                                blockStateBuilder.variant("facing=north,half=top,shape=inner_right", variant -> {
                                    variant.model(new Identifier(id.getNamespace(), "block/" + id.getPath() + "_inner"));
                                    variant.rotationX(180);
                                    variant.uvlock(true);
                                });
                                blockStateBuilder.variant("facing=south,half=top,shape=inner_right", variant -> {
                                    variant.model(new Identifier(id.getNamespace(), "block/" + id.getPath() + "_inner"));
                                    variant.rotationY(180);
                                    variant.uvlock(true);
                                    variant.rotationX(180);
                                });
                                blockStateBuilder.variant("facing=east,half=top,shape=inner_right", variant -> {
                                    variant.model(new Identifier(id.getNamespace(), "block/" + id.getPath() + "_inner"));
                                    variant.rotationY(90);
                                    variant.uvlock(true);
                                    variant.rotationX(180);
                                });
                                blockStateBuilder.variant("facing=west,half=top,shape=inner_right", variant -> {
                                    variant.model(new Identifier(id.getNamespace(), "block/" + id.getPath() + "_inner"));
                                    variant.rotationY(270);
                                    variant.uvlock(true);
                                    variant.rotationX(180);
                                });

                                blockStateBuilder.variant("facing=east,half=top,shape=inner_left", variant -> {
                                    variant.model(new Identifier(id.getNamespace(), "block/" + id.getPath() + "_inner"));
                                    variant.rotationX(180);
                                    variant.uvlock(true);
                                });
                                blockStateBuilder.variant("facing=west,half=top,shape=inner_left", variant -> {
                                    variant.model(new Identifier(id.getNamespace(), "block/" + id.getPath() + "_inner"));
                                    variant.rotationY(180);
                                    variant.uvlock(true);
                                    variant.rotationX(180);
                                });
                                blockStateBuilder.variant("facing=south,half=top,shape=inner_left", variant -> {
                                    variant.model(new Identifier(id.getNamespace(), "block/" + id.getPath() + "_inner"));
                                    variant.rotationY(90);
                                    variant.uvlock(true);
                                    variant.rotationX(180);
                                });
                                blockStateBuilder.variant("facing=north,half=top,shape=inner_left", variant -> {
                                    variant.model(new Identifier(id.getNamespace(), "block/" + id.getPath() + "_inner"));
                                    variant.rotationY(270);
                                    variant.uvlock(true);
                                    variant.rotationX(180);
                                });
                            });
                        } else {
                            pack.addBlockState(id, blockStateBuilder -> {
                                blockStateBuilder.variant("", variant -> {
                                    variant.model(new Identifier(id.getNamespace(), "block/" + id.getPath()));
                                });
                            });
                        }
                    }
                }
            }
        });
    }
}
