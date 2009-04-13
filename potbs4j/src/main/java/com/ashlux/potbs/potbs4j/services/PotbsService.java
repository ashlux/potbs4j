package com.ashlux.potbs.potbs4j.services;

public interface PotbsService
{
    /**
     * Minimum number of minutes this service is cached for and should not be recalled.
     *
     * @return update frequency in minutes
     */
    long getMinimumUpdateFrequency();
}
