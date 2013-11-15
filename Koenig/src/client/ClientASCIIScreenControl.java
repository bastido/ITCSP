package client;

import asciikonsole.ASCIIScreenControl;

public class ClientASCIIScreenControl {
	ASCIIScreenControl screenControl;
	
	
	
	public ClientASCIIScreenControl(){
		screenControl = new ASCIIScreenControl();
	}
	
	public String command(String _commandLine){
		
		String commandLine = _commandLine;
		
		if(commandLine.startsWith("<writeASCIISymbol>")){
			commandLine = cutFirstTag(_commandLine);
			String x = getFirstTag(commandLine);
			commandLine = cutFirstTag(commandLine);
			String y = getFirstTag(commandLine);
			commandLine = cutFirstTag(commandLine);
			String symbol = getFirstTag(commandLine);
			
			screenControl.writeASCIISymbol(Integer.parseInt(x), Integer.parseInt(y), symbol.charAt(0));
			
			return "";
			
		} else if(commandLine.startsWith("<writeASCIILine>")) {
			commandLine = cutFirstTag(_commandLine);
			String lineNumber = getFirstTag(commandLine);
			commandLine = cutFirstTag(commandLine);
			String line = getFirstTag(commandLine);
			
			screenControl.writeASCIILine(Integer.parseInt(lineNumber), line);
			
			return "";
			
		} else if(commandLine.startsWith("<resetScreen>")){
			screenControl.resetScreen();
			return "";
		} else if(commandLine.startsWith("<updateScreen>")){
			screenControl.updateScreen();
			return "";
		} else if(commandLine.startsWith("<getString>")){
			return screenControl.getString();
		} else if(commandLine.startsWith("<getKey>")){
			return screenControl.getKey();
		}
			
		System.out.println("Bei der Nachricht handelt es sich um keinen g�ltigen Befehl!");
		
		return "";
	}
	
	private String getFirstTag(String _tagString){
		String tempString = _tagString;
		if(tempString.startsWith("<")){
			tempString = tempString.substring(1);
			int endPosition = tempString.indexOf('>');
			return tempString.substring(0, endPosition);
		}

		return "";
		
	}
	
	private String cutFirstTag(String _tagString){
		int endOfFirstTag = _tagString.indexOf('>');
		
		return _tagString.substring(endOfFirstTag+1);
	}
	
	
	
}
