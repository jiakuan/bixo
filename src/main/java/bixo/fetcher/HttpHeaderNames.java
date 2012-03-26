/*
 * Copyright 2009-2012 Scale Unlimited
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */
package bixo.fetcher;


/**
 * A collection of HTTP header names.
 *
 * @see <a href="http://rfc-ref.org/RFC-TEXTS/2616/">Hypertext Transfer
 *      Protocol -- HTTP/1.1 (RFC 2616)</a>
 *
 */
public interface HttpHeaderNames {

    public final static String CONTENT_ENCODING = "Content-Encoding";

    public final static String CONTENT_LANGUAGE = "Content-Language";

    public final static String CONTENT_LENGTH = "Content-Length";

    public final static String CONTENT_LOCATION = "Content-Location";

    public static final String CONTENT_DISPOSITION = "Content-Disposition";

    public final static String CONTENT_MD5 = "Content-MD5";

    public final static String CONTENT_TYPE = "Content-Type";

    public final static String LAST_MODIFIED = "Last-Modified";

    public final static String LOCATION = "Location";

    public static final String ACCEPT_LANGUAGE = "Accept-Language";

    public static final String ACCEPT_CHARSET = "Accept-Charset";

    public static final String ACCEPT_ENCODING = "Accept-Encoding";

    public static final String ACCEPT = "Accept";
    

}
