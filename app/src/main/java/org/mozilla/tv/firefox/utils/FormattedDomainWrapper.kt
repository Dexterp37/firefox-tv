/* This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */

package org.mozilla.tv.firefox.utils

import android.app.Application
import java.net.URI

/**
 * TODO
 */
class FormattedDomainWrapper(private val application: Application) {

    fun format(uri: URI, shouldIncludePublicSuffix: Boolean, subdomainCount: Int) =
        FormattedDomain.format(application, uri, shouldIncludePublicSuffix, subdomainCount)

}
