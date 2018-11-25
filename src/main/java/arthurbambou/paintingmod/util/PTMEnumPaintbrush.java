package arthurbambou.paintingmod.util;

import net.minecraft.util.IStringSerializable;
import net.minecraft.util.text.TextFormatting;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public enum PTMEnumPaintbrush implements IStringSerializable {
    NORMAL(16, 0, "normal", "normal", 100000, TextFormatting.ITALIC),
    BLACK(15, 1, "black", "black", 1908001, TextFormatting.BLACK),
    RED(14, 2, "red", "red", 11546150, TextFormatting.DARK_RED),
    GREEN(13, 3, "green", "green", 6192150, TextFormatting.DARK_GREEN),
    BROWN(12, 4, "brown", "brown", 8606770, TextFormatting.GOLD),
    BLUE(11, 5, "blue", "blue", 3949738, TextFormatting.DARK_BLUE),
    PURPLE(10, 6, "purple", "purple", 8991416, TextFormatting.DARK_PURPLE),
    CYAN(9, 7, "cyan", "cyan", 1481884, TextFormatting.DARK_AQUA),
    LIGHT_GRAY(8, 8, "light_gray", "light_gray", 10329495, TextFormatting.GRAY),
    GRAY(7, 9, "gray", "gray", 4673362, TextFormatting.DARK_GRAY),
    PINK(6, 10, "pink", "pink", 15961002, TextFormatting.LIGHT_PURPLE),
    LIME(5, 11, "lime", "lime", 8439583, TextFormatting.GREEN),
    YELLOW(4, 12, "yellow", "yellow", 16701501, TextFormatting.YELLOW),
    LIGHT_BLUE(3, 13, "light_blue", "light_blue", 3847130, TextFormatting.BLUE),
    MAGENTA(2, 14, "magenta", "magenta", 13061821, TextFormatting.AQUA),
    ORANGE(1, 15, "orange", "orange", 16351261, TextFormatting.GOLD),
    WHITE(0, 16, "white", "white", 16383998,TextFormatting.WHITE);

    private static final PTMEnumPaintbrush[] META_LOOKUP = new PTMEnumPaintbrush[values().length];
    private static final PTMEnumPaintbrush[] DYE_DMG_LOOKUP = new PTMEnumPaintbrush[values().length];
    private final int meta;
    private final int dyeDamage;
    private final String name;
    private final String translationKey;
    /** An int containing the corresponding RGB color for this dye color. */
    private final int colorValue;
    /**
     * An array containing 3 floats ranging from 0.0 to 1.0: the red, green, and blue components of the corresponding
     * color.
     */
    private final float[] colorComponentValues;
    private final TextFormatting chatColor;

    private PTMEnumPaintbrush(int metaIn, int dyeDamageIn, String nameIn, String unlocalizedNameIn, int colorValueIn, TextFormatting chatColorIn)
    {
        this.meta = metaIn;
        this.dyeDamage = dyeDamageIn;
        this.name = nameIn;
        this.translationKey = unlocalizedNameIn;
        this.colorValue = colorValueIn;
        this.chatColor = chatColorIn;
        int i = (colorValueIn & 16711680) >> 16;
        int j = (colorValueIn & 65280) >> 8;
        int k = (colorValueIn & 255) >> 0;
        this.colorComponentValues = new float[] {(float)i / 255.0F, (float)j / 255.0F, (float)k / 255.0F};
    }

    public int getMetadata()
    {
        return this.meta;
    }

    public int getDyeDamage()
    {
        return this.dyeDamage;
    }

    @SideOnly(Side.CLIENT)
    public String getDyeColorName()
    {
        return this.name;
    }

    public String getTranslationKey()
    {
        return this.translationKey;
    }

    /**
     * Gets the RGB color corresponding to this dye color.
     */
    @SideOnly(Side.CLIENT)
    public int getColorValue()
    {
        return this.colorValue;
    }

    /**
     * Gets an array containing 3 floats ranging from 0.0 to 1.0: the red, green, and blue components of the
     * corresponding color.
     */
    public float[] getColorComponentValues()
    {
        return this.colorComponentValues;
    }

    public static PTMEnumPaintbrush byDyeDamage(int damage)
    {
        if (damage < 0 || damage >= DYE_DMG_LOOKUP.length)
        {
            damage = 0;
        }

        return DYE_DMG_LOOKUP[damage];
    }

    public static PTMEnumPaintbrush byMetadata(int meta)
    {
        if (meta < 0 || meta >= META_LOOKUP.length)
        {
            meta = 0;
        }

        return META_LOOKUP[meta];
    }

    public String toString()
    {
        return this.translationKey;
    }

    public String getName()
    {
        return this.name;
    }

    static
    {
        for (PTMEnumPaintbrush enumdyecolor : values())
        {
            META_LOOKUP[enumdyecolor.getMetadata()] = enumdyecolor;
            DYE_DMG_LOOKUP[enumdyecolor.getDyeDamage()] = enumdyecolor;
        }
    }
}
