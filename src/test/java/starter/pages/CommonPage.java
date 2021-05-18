package starter.pages;

import java.io.IOException;

import net.serenitybdd.core.Serenity;
import net.thucydides.core.annotations.Step;
import utils.ReadProperty;

public class CommonPage
{
	
    @Step
    public void setGlobalPropertiesVeriable(String vname) throws IOException
    {
		Serenity.setSessionVariable(vname).to(ReadProperty.getGlobalProperty(vname));
    }
    
    @Step
    public String getGlobalPropertiesVeriable(String string) throws IOException
    {
		return Serenity.sessionVariableCalled(string);
    }

}
