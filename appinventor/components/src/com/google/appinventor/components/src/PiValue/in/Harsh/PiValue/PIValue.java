package in.PiValue.Extension;
import android.content.Context;
import android.util.Log;
import com.google.appinventor.components.annotations.*;
import com.google.appinventor.components.runtime.*;
import com.google.appinventor.components.common.ComponentCategory;

@DesignerComponent(version = 1,  description = "Made With Love By Raja Harsh Vardhan Solanki.",
category = ComponentCategory.EXTENSION,
nonVisible = true,   iconName = "https://drive.google.com/u/1/uc?id=1Ka5n4t8-_EljCbATaTviRbK8KZ_FVn6d&export=download")

@SimpleObject(external = true)
public class PIValue extends AndroidNonvisibleComponent {
private ComponentContainer container;
/**
* @param container container, component will be placed in
*/

public PIValue(ComponentContainer container) {
super(container.$form());
this.container = container;
}

@SimpleFunction(description = "Returns PI Value Simple And Also In Evaluated Form.")
public static String PIValue(boolean isEvaluated)
{
String a = "3.14159";
String b = "22/7";
String c = "Set boolean to get the result.";


if (isEvaluated == true)
{

return a;

} else if (isEvaluated == false)
{
return b;
} else
  {

return c;
}
}


}
