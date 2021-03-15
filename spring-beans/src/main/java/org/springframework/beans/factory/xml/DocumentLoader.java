/*
 * Copyright 2002-2012 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.beans.factory.xml;

import org.w3c.dom.Document;
import org.xml.sax.EntityResolver;
import org.xml.sax.ErrorHandler;
import org.xml.sax.InputSource;

/**
 * Strategy interface for loading an XML {@link Document}.
 *
 * @author Rob Harrop
 * @since 2.0
 * @see DefaultDocumentLoader
 * Strategy [ˈstrætədʒi] n. 战略，策略
 *
 * 定义从资源文件加载到转化为Document的功能
 */
public interface DocumentLoader {

	/**
	 * Load a {@link Document document} from the supplied {@link InputSource source}.
	 * @param inputSource the source of the document that is to be loaded
	 * @param entityResolver the resolver that is to be used to resolve any entities
	 * @param errorHandler used to report any errors during document loading
	 * @param validationMode the type of validation
	 * {@link org.springframework.util.xml.XmlValidationModeDetector#VALIDATION_DTD DTD}
	 * or {@link org.springframework.util.xml.XmlValidationModeDetector#VALIDATION_XSD XSD})
	 * @param namespaceAware {@code true} if support for XML namespaces is to be provided
	 * @return the loaded {@link Document document}
	 * @throws Exception if an error occurs
	 * supplied [səˈplaɪd] adj. 有...提供的；备有...的 v. 提供；供应（supply的过去式）
	 * Resolver [riː'zɒlvə] n. 溶剂；[电子] 分解器；下决心者 解析器
	 * Handler [ˈhændlə(r)] n. 处理者；管理者；拳击教练；（犬马等的）训练者
	 * validation [ˌvælɪˈdeɪʃn] n. 确认；批准；生效
	 * Aware [əˈweə(r)] adj. 意识到的；知道的；有…方面知识的；懂世故的
	 */
	Document loadDocument(
			InputSource inputSource, EntityResolver entityResolver,
			ErrorHandler errorHandler, int validationMode, boolean namespaceAware)
			throws Exception;

}
