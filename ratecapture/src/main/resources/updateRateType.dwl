%dw 1.0
%output application/xml
%namespace ns0 http://service.fxaip.fx.wf.com/
%function split(data) {
	returnData: "USD/INR" splitBy "/"
}
---
{
	ns0#updateRate: {
		currencyPair: {
			deno: payload.FXRates.FXRate.xccy default "USD",
			nume: payload.FXRates.FXRate.ccy
		},
		rate: {
			rate: payload.FXRates.FXRate.rate,
			inRate: (1 / payload.FXRates.FXRate.rate) [0..10]
		}
	}
}