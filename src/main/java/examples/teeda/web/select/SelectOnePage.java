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
package examples.teeda.web.select;

import java.util.ArrayList;
import java.util.List;

public class SelectOnePage {

	private List aaaItems;

	private String aaa;

	public String prerender() {
		aaaItems = new ArrayList();
		AaaDto dto1 = new AaaDto();
		dto1.setValue("0");
		dto1.setLabel("AAAA");
		aaaItems.add(dto1);
		AaaDto dto2 = new AaaDto();
		dto2.setValue("1");
		dto2.setLabel("BBBB");
		aaaItems.add(dto2);
		AaaDto dto3 = new AaaDto();
		dto3.setValue("2");
		dto3.setLabel("CCCC");
		aaaItems.add(dto3);
		return null;
	}

	public List getAaaItems() {
		return aaaItems;
	}

	public void setAaaItems(List aaaItems) {
		this.aaaItems = aaaItems;
	}

	public String getAaa() {
		return aaa;
	}

	public void setAaa(String aaa) {
		this.aaa = aaa;
	}

	public String doAction() {
		return null;
	}
}
