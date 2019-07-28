package fr.arthurbambou.paintingmod.mainmod;

import com.swordglowsblue.artifice.api.Artifice;
import fr.arthurbambou.paintingmod.mainmod.api.ColoredObject;
import net.fabricmc.api.ClientModInitializer;
import net.minecraft.block.*;
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
                                    variant.rotationY(180);
                                    variant.rotationX(180);
                                    variant.uvlock(true);
                                });
                                blockStateBuilder.variant("facing=north,half=top,shape=outer_right", variant -> {
                                    variant.model(new Identifier(id.getNamespace(), "block/" + id.getPath() + "_outer"));
                                    variant.uvlock(true);
                                    variant.rotationX(180);
                                });
                                blockStateBuilder.variant("facing=west,half=top,shape=outer_right", variant -> {
                                    variant.model(new Identifier(id.getNamespace(), "block/" + id.getPath() + "_outer"));
                                    variant.uvlock(true);
                                    variant.rotationX(180);
                                    variant.rotationY(270);
                                });
                                blockStateBuilder.variant("facing=east,half=top,shape=outer_right", variant -> {
                                    variant.model(new Identifier(id.getNamespace(), "block/" + id.getPath() + "_outer"));
                                    variant.uvlock(true);
                                    variant.rotationX(180);
                                    variant.rotationY(90);
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
                            if (block instanceof FenceBlock) {
                                pack.addBlockState(id, blockStateBuilder -> {
                                    blockStateBuilder.multipartCase(aCase -> {
                                        aCase.apply(variant -> {
                                            variant.model(new Identifier(id.getNamespace(), "block/" + id.getPath() + "_post"));
                                        });
                                    });
                                    blockStateBuilder.multipartCase(aCase -> {
                                        aCase.when("north", "true").apply(variant -> {
                                            variant.model(new Identifier(id.getNamespace(), "block/" + id.getPath() + "_side"));
                                            variant.uvlock(true);
                                        });
                                    });
                                    blockStateBuilder.multipartCase(aCase -> {
                                        aCase.when("east", "true").apply(variant -> {
                                            variant.model(new Identifier(id.getNamespace(), "block/" + id.getPath() + "_side"));
                                            variant.uvlock(true);
                                            variant.rotationY(90);
                                        });
                                    });
                                    blockStateBuilder.multipartCase(aCase -> {
                                        aCase.when("south", "true").apply(variant -> {
                                            variant.model(new Identifier(id.getNamespace(), "block/" + id.getPath() + "_side"));
                                            variant.uvlock(true);
                                            variant.rotationY(180);
                                        });
                                    });
                                    blockStateBuilder.multipartCase(aCase -> {
                                        aCase.when("west", "true").apply(variant -> {
                                            variant.model(new Identifier(id.getNamespace(), "block/" + id.getPath() + "_side"));
                                            variant.uvlock(true);
                                            variant.rotationY(270);
                                        });
                                    });
                                });
                            } else {
                                if (block instanceof WallBlock) {
                                    pack.addBlockState(id, blockStateBuilder -> {
                                        blockStateBuilder.multipartCase(aCase -> {
                                            aCase.when("up","true").apply(variant -> {
                                                variant.model(new Identifier(id.getNamespace(), "block/" + id.getPath() + "_post"));
                                            });
                                        });
                                        blockStateBuilder.multipartCase(aCase -> {
                                            aCase.when("north", "true").apply(variant -> {
                                                variant.model(new Identifier(id.getNamespace(), "block/" + id.getPath() + "_side"));
                                                variant.uvlock(true);
                                            });
                                        });
                                        blockStateBuilder.multipartCase(aCase -> {
                                            aCase.when("east", "true").apply(variant -> {
                                                variant.model(new Identifier(id.getNamespace(), "block/" + id.getPath() + "_side"));
                                                variant.uvlock(true);
                                                variant.rotationY(90);
                                            });
                                        });
                                        blockStateBuilder.multipartCase(aCase -> {
                                            aCase.when("south", "true").apply(variant -> {
                                                variant.model(new Identifier(id.getNamespace(), "block/" + id.getPath() + "_side"));
                                                variant.uvlock(true);
                                                variant.rotationY(180);
                                            });
                                        });
                                        blockStateBuilder.multipartCase(aCase -> {
                                            aCase.when("west", "true").apply(variant -> {
                                                variant.model(new Identifier(id.getNamespace(), "block/" + id.getPath() + "_side"));
                                                variant.uvlock(true);
                                                variant.rotationY(270);
                                            });
                                        });
                                    });
                                } else {
                                    if (block instanceof FenceGateBlock) {
                                        pack.addBlockState(id, blockStateBuilder -> {
                                            blockStateBuilder.variant("facing=south,in_wall=false,open=false", variant -> {
                                                variant.model(new Identifier(id.getNamespace(), "block/" + id.getPath()));
                                                variant.uvlock(true);
                                            });
                                            blockStateBuilder.variant("facing=west,in_wall=false,open=false", variant -> {
                                                variant.model(new Identifier(id.getNamespace(), "block/" + id.getPath()));
                                                variant.uvlock(true);
                                                variant.rotationY(90);
                                            });
                                            blockStateBuilder.variant("facing=north,in_wall=false,open=false", variant -> {
                                                variant.model(new Identifier(id.getNamespace(), "block/" + id.getPath()));
                                                variant.uvlock(true);
                                                variant.rotationY(180);
                                            });
                                            blockStateBuilder.variant("facing=east,in_wall=false,open=false", variant -> {
                                                variant.model(new Identifier(id.getNamespace(), "block/" + id.getPath()));
                                                variant.uvlock(true);
                                                variant.rotationY(270);
                                            });

                                            blockStateBuilder.variant("facing=south,in_wall=false,open=true", variant -> {
                                                variant.model(new Identifier(id.getNamespace(), "block/" + id.getPath() + "_open"));
                                                variant.uvlock(true);
                                            });
                                            blockStateBuilder.variant("facing=west,in_wall=false,open=true", variant -> {
                                                variant.model(new Identifier(id.getNamespace(), "block/" + id.getPath() + "_open"));
                                                variant.uvlock(true);
                                                variant.rotationY(90);
                                            });
                                            blockStateBuilder.variant("facing=north,in_wall=false,open=true", variant -> {
                                                variant.model(new Identifier(id.getNamespace(), "block/" + id.getPath() + "_open"));
                                                variant.uvlock(true);
                                                variant.rotationY(180);
                                            });
                                            blockStateBuilder.variant("facing=east,in_wall=false,open=true", variant -> {
                                                variant.model(new Identifier(id.getNamespace(), "block/" + id.getPath() + "_open"));
                                                variant.uvlock(true);
                                                variant.rotationY(270);
                                            });


                                            blockStateBuilder.variant("facing=south,in_wall=true,open=false", variant -> {
                                                variant.model(new Identifier(id.getNamespace(), "block/" + id.getPath() + "_wall"));
                                                variant.uvlock(true);
                                            });
                                            blockStateBuilder.variant("facing=west,in_wall=true,open=false", variant -> {
                                                variant.model(new Identifier(id.getNamespace(), "block/" + id.getPath() + "_wall"));
                                                variant.uvlock(true);
                                                variant.rotationY(90);
                                            });
                                            blockStateBuilder.variant("facing=north,in_wall=true,open=false", variant -> {
                                                variant.model(new Identifier(id.getNamespace(), "block/" + id.getPath() + "_wall"));
                                                variant.uvlock(true);
                                                variant.rotationY(180);
                                            });
                                            blockStateBuilder.variant("facing=east,in_wall=true,open=false", variant -> {
                                                variant.model(new Identifier(id.getNamespace(), "block/" + id.getPath() + "_wall"));
                                                variant.uvlock(true);
                                                variant.rotationY(270);
                                            });

                                            blockStateBuilder.variant("facing=south,in_wall=true,open=true", variant -> {
                                                variant.model(new Identifier(id.getNamespace(), "block/" + id.getPath() + "_wall" + "_open"));
                                                variant.uvlock(true);
                                            });
                                            blockStateBuilder.variant("facing=west,in_wall=true,open=true", variant -> {
                                                variant.model(new Identifier(id.getNamespace(), "block/" + id.getPath() + "_wall" + "_open"));
                                                variant.uvlock(true);
                                                variant.rotationY(90);
                                            });
                                            blockStateBuilder.variant("facing=north,in_wall=true,open=true", variant -> {
                                                variant.model(new Identifier(id.getNamespace(), "block/" + id.getPath() + "_wall" + "_open"));
                                                variant.uvlock(true);
                                                variant.rotationY(180);
                                            });
                                            blockStateBuilder.variant("facing=east,in_wall=true,open=true", variant -> {
                                                variant.model(new Identifier(id.getNamespace(), "block/" + id.getPath() + "_wall" + "_open"));
                                                variant.uvlock(true);
                                                variant.rotationY(270);
                                            });
                                        });
                                    } else {
                                        if (block instanceof AbstractButtonBlock) {
                                            pack.addBlockState(id, blockStateBuilder -> {
                                                blockStateBuilder.variant("face=floor,facing=east,powered=false", variant -> {
                                                    variant.model(new Identifier(id.getNamespace(), "block/" + id.getPath()));
                                                    variant.rotationY(90);
                                                });
                                                blockStateBuilder.variant("face=floor,facing=west,powered=false", variant -> {
                                                    variant.model(new Identifier(id.getNamespace(), "block/" + id.getPath()));
                                                    variant.rotationY(270);
                                                });
                                                blockStateBuilder.variant("face=floor,facing=south,powered=false", variant -> {
                                                    variant.model(new Identifier(id.getNamespace(), "block/" + id.getPath()));
                                                    variant.rotationY(180);
                                                });
                                                blockStateBuilder.variant("face=floor,facing=north,powered=false", variant -> {
                                                    variant.model(new Identifier(id.getNamespace(), "block/" + id.getPath()));
                                                });

                                                blockStateBuilder.variant("face=wall,facing=east,powered=false", variant -> {
                                                    variant.model(new Identifier(id.getNamespace(), "block/" + id.getPath()));
                                                    variant.rotationY(90);
                                                    variant.rotationX(90);
                                                    variant.uvlock(true);
                                                });
                                                blockStateBuilder.variant("face=wall,facing=west,powered=false", variant -> {
                                                    variant.model(new Identifier(id.getNamespace(), "block/" + id.getPath()));
                                                    variant.rotationY(270);
                                                    variant.rotationX(90);
                                                    variant.uvlock(true);
                                                });
                                                blockStateBuilder.variant("face=wall,facing=south,powered=false", variant -> {
                                                    variant.model(new Identifier(id.getNamespace(), "block/" + id.getPath()));
                                                    variant.rotationY(180);
                                                    variant.rotationX(90);
                                                    variant.uvlock(true);
                                                });
                                                blockStateBuilder.variant("face=wall,facing=north,powered=false", variant -> {
                                                    variant.model(new Identifier(id.getNamespace(), "block/" + id.getPath()));
                                                    variant.rotationX(90);
                                                    variant.uvlock(true);
                                                });

                                                blockStateBuilder.variant("face=ceiling,facing=east,powered=false", variant -> {
                                                    variant.model(new Identifier(id.getNamespace(), "block/" + id.getPath()));
                                                    variant.rotationX(180);
                                                    variant.rotationY(270);
                                                });
                                                blockStateBuilder.variant("face=ceiling,facing=west,powered=false", variant -> {
                                                    variant.model(new Identifier(id.getNamespace(), "block/" + id.getPath()));
                                                    variant.rotationX(180);
                                                    variant.rotationY(90);
                                                });
                                                blockStateBuilder.variant("face=ceiling,facing=south,powered=false", variant -> {
                                                    variant.model(new Identifier(id.getNamespace(), "block/" + id.getPath()));
                                                    variant.rotationX(180);
                                                });
                                                blockStateBuilder.variant("face=ceiling,facing=north,powered=false", variant -> {
                                                    variant.model(new Identifier(id.getNamespace(), "block/" + id.getPath()));
                                                    variant.rotationX(180);
                                                    variant.rotationY(180);
                                                });


                                                blockStateBuilder.variant("face=floor,facing=east,powered=true", variant -> {
                                                    variant.model(new Identifier(id.getNamespace(), "block/" + id.getPath() + "_pressed"));
                                                    variant.rotationY(90);
                                                });
                                                blockStateBuilder.variant("face=floor,facing=west,powered=true", variant -> {
                                                    variant.model(new Identifier(id.getNamespace(), "block/" + id.getPath() + "_pressed"));
                                                    variant.rotationY(270);
                                                });
                                                blockStateBuilder.variant("face=floor,facing=south,powered=true", variant -> {
                                                    variant.model(new Identifier(id.getNamespace(), "block/" + id.getPath() + "_pressed"));
                                                    variant.rotationY(180);
                                                });
                                                blockStateBuilder.variant("face=floor,facing=north,powered=true", variant -> {
                                                    variant.model(new Identifier(id.getNamespace(), "block/" + id.getPath() + "_pressed"));
                                                });

                                                blockStateBuilder.variant("face=wall,facing=east,powered=true", variant -> {
                                                    variant.model(new Identifier(id.getNamespace(), "block/" + id.getPath() + "_pressed"));
                                                    variant.rotationY(90);
                                                    variant.rotationX(90);
                                                    variant.uvlock(true);
                                                });
                                                blockStateBuilder.variant("face=wall,facing=west,powered=true", variant -> {
                                                    variant.model(new Identifier(id.getNamespace(), "block/" + id.getPath() + "_pressed"));
                                                    variant.rotationY(270);
                                                    variant.rotationX(90);
                                                    variant.uvlock(true);
                                                });
                                                blockStateBuilder.variant("face=wall,facing=south,powered=true", variant -> {
                                                    variant.model(new Identifier(id.getNamespace(), "block/" + id.getPath() + "_pressed"));
                                                    variant.rotationY(180);
                                                    variant.rotationX(90);
                                                    variant.uvlock(true);
                                                });
                                                blockStateBuilder.variant("face=wall,facing=north,powered=true", variant -> {
                                                    variant.model(new Identifier(id.getNamespace(), "block/" + id.getPath() + "_pressed"));
                                                    variant.rotationX(90);
                                                    variant.uvlock(true);
                                                });

                                                blockStateBuilder.variant("face=ceiling,facing=east,powered=true", variant -> {
                                                    variant.model(new Identifier(id.getNamespace(), "block/" + id.getPath() + "_pressed"));
                                                    variant.rotationX(180);
                                                    variant.rotationY(270);
                                                });
                                                blockStateBuilder.variant("face=ceiling,facing=west,powered=true", variant -> {
                                                    variant.model(new Identifier(id.getNamespace(), "block/" + id.getPath() + "_pressed"));
                                                    variant.rotationX(180);
                                                    variant.rotationY(90);
                                                });
                                                blockStateBuilder.variant("face=ceiling,facing=south,powered=true", variant -> {
                                                    variant.model(new Identifier(id.getNamespace(), "block/" + id.getPath() + "_pressed"));
                                                    variant.rotationX(180);
                                                });
                                                blockStateBuilder.variant("face=ceiling,facing=north,powered=true", variant -> {
                                                    variant.model(new Identifier(id.getNamespace(), "block/" + id.getPath() + "_pressed"));
                                                    variant.rotationX(180);
                                                    variant.rotationY(180);
                                                });
                                            });
                                        } else {
                                            if (block instanceof PressurePlateBlock) {
                                                pack.addBlockState(id, blockStateBuilder -> {
                                                    blockStateBuilder.variant("powered=false", variant -> {
                                                        variant.model(new Identifier(id.getNamespace(), "block/" + id.getPath()));
                                                    });
                                                    blockStateBuilder.variant("powered=true", variant -> {
                                                        variant.model(new Identifier(id.getNamespace(), "block/" + id.getPath() + "_down"));
                                                    });
                                                });
                                            } else {
                                                if (block instanceof WeightedPressurePlateBlock) {
                                                    pack.addBlockState(id, blockStateBuilder -> {
                                                        blockStateBuilder.variant("power=0", variant -> {
                                                            variant.model(new Identifier(id.getNamespace(), "block/" + id.getPath()));
                                                        });
                                                        blockStateBuilder.variant("power=1", variant -> {
                                                            variant.model(new Identifier(id.getNamespace(), "block/" + id.getPath() + "_down"));
                                                        });
                                                        blockStateBuilder.variant("power=2", variant -> {
                                                            variant.model(new Identifier(id.getNamespace(), "block/" + id.getPath() + "_down"));
                                                        });
                                                        blockStateBuilder.variant("power=3", variant -> {
                                                            variant.model(new Identifier(id.getNamespace(), "block/" + id.getPath() + "_down"));
                                                        });
                                                        blockStateBuilder.variant("power=4", variant -> {
                                                            variant.model(new Identifier(id.getNamespace(), "block/" + id.getPath() + "_down"));
                                                        });
                                                        blockStateBuilder.variant("power=5", variant -> {
                                                            variant.model(new Identifier(id.getNamespace(), "block/" + id.getPath() + "_down"));
                                                        });
                                                        blockStateBuilder.variant("power=6", variant -> {
                                                            variant.model(new Identifier(id.getNamespace(), "block/" + id.getPath() + "_down"));
                                                        });
                                                        blockStateBuilder.variant("power=7", variant -> {
                                                            variant.model(new Identifier(id.getNamespace(), "block/" + id.getPath() + "_down"));
                                                        });
                                                        blockStateBuilder.variant("power=8", variant -> {
                                                            variant.model(new Identifier(id.getNamespace(), "block/" + id.getPath() + "_down"));
                                                        });
                                                        blockStateBuilder.variant("power=9", variant -> {
                                                            variant.model(new Identifier(id.getNamespace(), "block/" + id.getPath() + "_down"));
                                                        });
                                                        blockStateBuilder.variant("power=10", variant -> {
                                                            variant.model(new Identifier(id.getNamespace(), "block/" + id.getPath() + "_down"));
                                                        });
                                                        blockStateBuilder.variant("power=11", variant -> {
                                                            variant.model(new Identifier(id.getNamespace(), "block/" + id.getPath() + "_down"));
                                                        });
                                                        blockStateBuilder.variant("power=12", variant -> {
                                                            variant.model(new Identifier(id.getNamespace(), "block/" + id.getPath() + "_down"));
                                                        });
                                                        blockStateBuilder.variant("power=13", variant -> {
                                                            variant.model(new Identifier(id.getNamespace(), "block/" + id.getPath() + "_down"));
                                                        });
                                                        blockStateBuilder.variant("power=14", variant -> {
                                                            variant.model(new Identifier(id.getNamespace(), "block/" + id.getPath() + "_down"));
                                                        });
                                                        blockStateBuilder.variant("power=15", variant -> {
                                                            variant.model(new Identifier(id.getNamespace(), "block/" + id.getPath() + "_down"));
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
                                }
                            }
                        }
                    }
                }
            }
        });
    }
}
