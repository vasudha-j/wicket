package wicket;

import java.awt.Label;

import org.apache.wicket.Component;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.link.Link;
import org.apache.wicket.model.AbstractReadOnlyModel;
import org.apache.wicket.model.IModel;

public class Wicket extends WebPage {
	
	private static final long serialVersionUID = 1L;
	 

    public Wicket() {
 
      
         
        Link<Void> link = new Link<Void>("increment") {
            private static final long serialVersionUID = 1L;
 
            @Override
            public void onClick() {
            	
            }
        };
        add(link);
    }
	
	

}
