package com.example.demo.webclient.dto;

import java.math.BigDecimal;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class Product {

	private String id;
	private String baseCurrency;
	private String quoteCurrency;
	private BigDecimal baseMinSize;
	private BigDecimal baseMaxSize;
	private BigDecimal quoteIncrement;
	private String displayName;
	private String status;
	private boolean marginEnabled;
	private String statusMessage;
	private BigDecimal minMarketFunds;
	private BigDecimal maxMarketFunds;
	private boolean postOnly;
	private boolean limitOnly;
	private boolean cancelOnly;

	public String getId() {
		return this.id;
	}

	public void setId(final String id) {
		this.id = id;
	}

	public String getBaseCurrency() {
		return this.baseCurrency;
	}

	public void setBaseCurrency(final String baseCurrency) {
		this.baseCurrency = baseCurrency;
	}

	public String getQuoteCurrency() {
		return this.quoteCurrency;
	}

	public void setQuoteCurrency(final String quoteCurrency) {
		this.quoteCurrency = quoteCurrency;
	}

	public BigDecimal getBaseMinSize() {
		return this.baseMinSize;
	}

	public void setBaseMinSize(final BigDecimal baseMinSize) {
		this.baseMinSize = baseMinSize;
	}

	public BigDecimal getBaseMaxSize() {
		return this.baseMaxSize;
	}

	public void setBaseMaxSize(final BigDecimal baseMaxSize) {
		this.baseMaxSize = baseMaxSize;
	}

	public BigDecimal getQuoteIncrement() {
		return this.quoteIncrement;
	}

	public void setQuoteIncrement(final BigDecimal quoteIncrement) {
		this.quoteIncrement = quoteIncrement;
	}

	public String getDisplayName() {
		return this.displayName;
	}

	public void setDisplayName(final String displayName) {
		this.displayName = displayName;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(final String status) {
		this.status = status;
	}

	public boolean isMarginEnabled() {
		return this.marginEnabled;
	}

	public void setMarginEnabled(final boolean marginEnabled) {
		this.marginEnabled = marginEnabled;
	}

	public String getStatusMessage() {
		return this.statusMessage;
	}

	public void setStatusMessage(final String statusMessage) {
		this.statusMessage = statusMessage;
	}

	public BigDecimal getMinMarketFunds() {
		return this.minMarketFunds;
	}

	public void setMinMarketFunds(final BigDecimal minMarketFunds) {
		this.minMarketFunds = minMarketFunds;
	}

	public BigDecimal getMaxMarketFunds() {
		return this.maxMarketFunds;
	}

	public void setMaxMarketFunds(final BigDecimal maxMarketFunds) {
		this.maxMarketFunds = maxMarketFunds;
	}

	public boolean isPostOnly() {
		return this.postOnly;
	}

	public void setPostOnly(final boolean postOnly) {
		this.postOnly = postOnly;
	}

	public boolean isLimitOnly() {
		return this.limitOnly;
	}

	public void setLimitOnly(final boolean limitOnly) {
		this.limitOnly = limitOnly;
	}

	public boolean isCancelOnly() {
		return this.cancelOnly;
	}

	public void setCancelOnly(final boolean cancelOnly) {
		this.cancelOnly = cancelOnly;
	}

}
