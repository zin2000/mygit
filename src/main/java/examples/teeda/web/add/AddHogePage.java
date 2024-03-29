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
package examples.teeda.web.add;

/**
 * @author shot
 * 
 */
public class AddHogePage {

	private String a;

	private String b;

	private boolean show;

	public AddHogePage() {
		System.out.println("a");
	}

	public String doRead() {
		setShow(true);
		return null;
	}

	public String getA() {
		return a;
	}

	public String getB() {
		return b;
	}

	public boolean isShow() {
		return show;
	}

	public void setA(String a) {
		this.a = a;
	}

	public void setB(String b) {
		this.b = b;
	}

	public void setShow(boolean show) {
		this.show = show;
	}
}
