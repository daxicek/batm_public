/*************************************************************************************
 * Copyright (C) 2014-2019 GENERAL BYTES s.r.o. All rights reserved.
 *
 * This software may be distributed and modified under the terms of the GNU
 * General Public License version 2 (GPL2) as published by the Free Software
 * Foundation and appearing in the file GPL2.TXT included in the packaging of
 * this file. Please note that GPL2 Section 2[b] requires that all works based
 * on this software must also be made publicly available under the terms of
 * the GPL2 ("Copyleft").
 *
 * Contact information
 * -------------------
 *
 * GENERAL BYTES s.r.o.
 * Web      :  http://www.generalbytes.com
 *
 ************************************************************************************/
package com.generalbytes.batm.server.extensions.extra.dash.sources.cddash;

import com.generalbytes.batm.server.extensions.extra.dash.sources.cddash.*;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/api/")
@Produces(MediaType.APPLICATION_JSON)
public interface ICryptodiggersRateAPI {
    @GET
    @Path("api.php?a=get_exch_rate&public=1&currency={fiatcurrency}&currency_crypto={cryptocurrency}")
    CryptodiggersResponse getTicker(@PathParam("cryptocurrency") String cryptoCurrency, @PathParam("fiatcurrency") String fiatCurrency);
}
