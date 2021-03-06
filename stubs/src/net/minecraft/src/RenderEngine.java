package net.minecraft.src;

import net.minecraft.client.Minecraft;

abstract public class RenderEngine {
    public TexturePackList texturePackList;

    abstract public int getTexture(String s);

    abstract public void createTextureFromBytes(int[] rgb, int width, int height, int texture);

    abstract public void setTileSize(Minecraft minecraft);
}
