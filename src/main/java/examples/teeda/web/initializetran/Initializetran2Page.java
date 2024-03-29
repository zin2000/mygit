/*
 * Copyright 2004-2011 the Seasar Foundation and the Others.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied. See the License for the specific language
 * governing permissions and limitations under the License.
 */
package examples.teeda.web.initializetran;

public class Initializetran2Page {

	private String aaa;

	/**
	 * @return the aaa
	 */
	public String getAaa() {
		return aaa;
	}

	/**
	 * @param aaa
	 *            the aaa to set
	 */
	public void setAaa(String aaa) {
		this.aaa = aaa;
	}

	public Class initialize() {
		return Initializetran3Page.class;
	}
}