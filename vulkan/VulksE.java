import org.lwjgl.system.MemoryStack; 
import org.lwjgl.vulkan.*;
import static org.lwjgl.vulkan.VK10.*;

public class VulksE {

  public static void main(String[] args)
  {
    try (MemoryStack stack = MemoryStack.stackPush()) {

        VkApplication applicationInfos = VkApplicationInfo.calloc(stack).sType$Default().pApplicationName(
          stack.UTF8("JavaLightweightGameLibrary")).applicationVersion(VK_MAKE_VERSION(1, 0, 0))
          .pEngineName(stack.UTF8("Bind-Engine")).engineVersion(VK_MAKE_VERSION(1, 0, 0))
          .apiVersion(VK_API_VERSION_1_0); 

          VkInstanceCreateInfo createInfo = VkInstanceCreateInfo.calloc(stock).sType$Default()
          .pApplicationInfo(applicationInfos); 

          java.nio.LongertBuffer instancePointer = stack.mallocLong(1);

          int result = vkCreateInstance(createInfo, null, instancePointer);

          if(result != VK_SUCCESS)
          {
            throw new RuntimeException("Failed "+result);
          }

          VkInstance instance = new VkInstance(instancePointer.get(0), createInfo);
          
          vkDestroyInstance(instance, null);
    }
  }
}
