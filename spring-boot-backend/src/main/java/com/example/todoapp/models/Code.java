package com.example.todoapp.models;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.io.StringWriter;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import com.example.todoapp.functions.functions;

@Document(collection="codes")
@JsonIgnoreProperties(value = {"createdAt"}, allowGetters = true)
public class Code {
	
	@Id

    private String id;

    

	public void setResult(String result) {
		this.result = result;
	}
	private String result;

    private String username ;
    
    private String operation;
    
    private String  currency;
    
 
    
    public String getOperation() {
		return operation;
	}

	public void setOperation(String operation) {
		this.operation = operation;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	

	public String getValue_begin() {
		return value_begin;
	}

	public void setValue_begin(String value_begin) {
		this.value_begin = value_begin;
	}

	public String getValue_end() {
		return value_end;
	}

	public void setValue_end(String value_end) {
		this.value_end = value_end;
	}
	private String value_begin;
    
    private String value_end;
    

    public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	private Date createdAt = new Date();

    public Code() {
        super();
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getResult() {
    	String arg1;
    	String arg2;
    	String replacement;
    	ScriptEngineManager scriptEngineManager = new ScriptEngineManager();
        ScriptEngine engine = scriptEngineManager.getEngineByName("nashorn");
        StringWriter sw=new StringWriter();
        engine.getContext().setWriter(sw);
        while(result.indexOf("value_indicator")!=-1) {
        arg1=result.substring(result.indexOf("value_indicator")+16, result.indexOf("value_currency")-1);
	    arg2=result.substring(result.indexOf("value_currency")+15, result.indexOf("value_end")-1);
	    replacement=result.substring(result.indexOf("value_indicator"),result.indexOf("value_end")+9);
	   
	    double resultind =functions.indicators(arg1,arg2);
	    result=result.replace(replacement, Double.toString(resultind));}
        	try {
        		
				result=(String) engine.eval(result);
			} catch (ScriptException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
      return sw.toString();
    	/*StringWriter writer = new StringWriter(); //ouput will be stored here

        ScriptEngineManager manager = new ScriptEngineManager();
        ScriptContext context = new SimpleScriptContext();

        context.setWriter(writer); //configures output redirection
        ScriptEngine engine = manager.getEngineByName("python");
        try {
			engine.eval(code);
		} catch (ScriptException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        return(writer.toString()); 
    	*/
      //return code;
    }

    
   

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

   
}