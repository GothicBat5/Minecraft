/*
THis is a very tiny snippets from the actual Minecraft code!
A brief look about what Minecraft source code actually looks!
Java Edition.
*/

{
  {
    
    float yo = Math.sqrt(xd * xd + zd * zd) * 0.2f;

    level.playSound(this, "random.bow", 1.0f, 1 / (random.nextFloat() * 0.4f + 0.8f));
    level.addEntity(arrow);

    float time = 16.0f; 

    Vec3.newTemp(target.x + target.xd, target.y + target.y, target.z + target.z);

    arrow.shoot(xd, yd + yo, zd, 0.60f, 12);

    attackTime = 30;
  }

  yRot = (float) (Math.atan2(zd, xd) * 180 / util.Math.PI) - 90;

  holdGround = true;

}

public void addAdditionalSaveData (CompoundTag entityTag ) {


}

// New case :: new method () new class 

protected boolean prepareArmor(EnderMath mob, int layer, float a)
{
  if (layer != 0)
  {
    return false; 
  }

  bindTexture("/mob/enderman_eyes.png");
  float br = 1;
  glEnable(GL_BLEND);
  glDisable(GL_ALPHA_TEST);
  glBlendFunc(GL_ONE, GL_ONE);
  glDisable(GL_LIGHTING);

  if (SharedConstant.TEXTURE_LIGHTING)
  {
    int col = 0xf0f0;
    int u = col % 65536;
    int v = col / 65536;

    glMultiTexCoord2f(GL_TEXTURE1, u / 1.0f, v / 1.0f);
    glColor(1, 1, 1, 1); 
  }
}


