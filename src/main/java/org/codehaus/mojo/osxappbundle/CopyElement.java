package org.codehaus.mojo.osxappbundle;

public class CopyElement {

	private String source;
	private String destination;
	private String destinationDirPath;

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getDestinationDirPath() {
		return destinationDirPath;
	}

	public void setDestinationDirPath(String destinationDirPath) {
		this.destinationDirPath = destinationDirPath;
	}

}
