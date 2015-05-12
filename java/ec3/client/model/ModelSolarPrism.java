// Date: 29.08.2014 15:55:28
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX






package ec3.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelSolarPrism extends ModelBase
{
  //fields
    ModelRenderer side0;
    ModelRenderer side1;
    ModelRenderer side2;
    ModelRenderer side3;
    ModelRenderer side4;
    ModelRenderer side5;
    ModelRenderer side6;
    ModelRenderer side7;
    ModelRenderer glass;
  
  public ModelSolarPrism()
  {
    textureWidth = 128;
    textureHeight = 128;
    
      side0 = new ModelRenderer(this, 0, 0);
      side0.addBox(-8F, -1F, -1F, 16, 2, 2);
      side0.setRotationPoint(0F, 15F, 23F);
      side0.setTextureSize(128, 128);
      side0.mirror = true;
      setRotation(side0, 0F, 0F, 0F);
      side1 = new ModelRenderer(this, 0, 0);
      side1.addBox(-8F, -1F, -1F, 16, 2, 2);
      side1.setRotationPoint(0F, 15F, -23F);
      side1.setTextureSize(128, 128);
      side1.mirror = true;
      setRotation(side1, 0F, 0F, 0F);
      side2 = new ModelRenderer(this, 0, 4);
      side2.addBox(-1F, -1F, -8F, 2, 2, 16);
      side2.setRotationPoint(23F, 15F, 0F);
      side2.setTextureSize(128, 128);
      side2.mirror = true;
      setRotation(side2, 0F, 0F, 0F);
      side3 = new ModelRenderer(this, 0, 4);
      side3.addBox(-1F, -1F, -8F, 2, 2, 16);
      side3.setRotationPoint(-23F, 15F, 0F);
      side3.setTextureSize(128, 128);
      side3.mirror = true;
      setRotation(side3, 0F, -0.0174533F, 0F);
      side4 = new ModelRenderer(this, 48, 0);
      side4.addBox(-1F, -1F, 0F, 2, 2, 22);
      side4.setRotationPoint(7.533333F, 15F, -23.13333F);
      side4.setTextureSize(128, 128);
      side4.mirror = true;
      setRotation(side4, 0F, 0.7853982F, 0F);
      side5 = new ModelRenderer(this, 48, 0);
      side5.addBox(-1F, -1F, 0F, 2, 2, 22);
      side5.setRotationPoint(-23F, 15F, 7.733333F);
      side5.setTextureSize(128, 128);
      side5.mirror = true;
      setRotation(side5, 0F, 0.7853982F, 0F);
      side6 = new ModelRenderer(this, 48, 0);
      side6.addBox(-1F, -1F, 0F, 2, 2, 22);
      side6.setRotationPoint(22.86667F, 15F, 7.733333F);
      side6.setTextureSize(128, 128);
      side6.mirror = true;
      setRotation(side6, 0F, -0.7853982F, 0F);
      side7 = new ModelRenderer(this, 48, 0);
      side7.addBox(-1F, -1F, 0F, 2, 2, 22);
      side7.setRotationPoint(-7.466667F, 15F, -23F);
      side7.setTextureSize(128, 128);
      side7.mirror = true;
      setRotation(side7, 0F, -0.7853982F, 0F);
      glass = new ModelRenderer(this, -44, 25);
      glass.addBox(0F, 0F, 0F, 44, 1, 44);
      glass.setRotationPoint(-22F, 14.5F, -22F);
      glass.setTextureSize(128, 128);
      glass.mirror = true;
      setRotation(glass, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    side0.render(f5);
    side1.render(f5);
    side2.render(f5);
    side3.render(f5);
    side4.render(f5);
    side5.render(f5);
    side6.render(f5);
    side7.render(f5);
    glass.render(f5);
  }
  
  public void render(float f5)
  {
	    side0.render(f5);
	    side1.render(f5);
	    side2.render(f5);
	    side3.render(f5);
	    side4.render(f5);
	    side5.render(f5);
	    side6.render(f5);
	    side7.render(f5);
	    glass.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e)
  {
    super.setRotationAngles(f, f1, f2, f3, f4, f5,e);
  }

}