package com.ashlux.potbs.potbs4j.util;

import com.ashlux.potbs4j.vo.PortName;

import java.util.Map;
import java.util.HashMap;

public class PortUtils
{
    private PortUtils()
    {
    }

    public static String toString( PortName.Enum portName )
    {
        return portNameMap.get( portName );
    }

    private static final Map<PortName.Enum, String> portNameMap =
        new HashMap<PortName.Enum, String>();

    static {
        portNameMap.put( PortName.AMBRGS, "Ambergris" );
        portNameMap.put( PortName.BEL_ISL, "Belle Isle" );
        portNameMap.put( PortName.BELIZE, "Belize" );
        portNameMap.put( PortName.BILOXI, "Biloxi" );
        portNameMap.put( PortName.BLUFLD, "Bluefields" );
        portNameMap.put( PortName.BRDGTN, "Bridgetown" );
        portNameMap.put( PortName.BRILLA, "Barilla" );
        portNameMap.put( PortName.BRTICA, "Bartica" );
        portNameMap.put( PortName.BSSTRR, "Basseterre" );
        portNameMap.put( PortName.CAT_ISL, "Cat Island" );
        portNameMap.put( PortName.CAYENN, "Cayenne" );
        portNameMap.put( PortName.CB_RPHL, "Cabo Raphael" );
        portNameMap.put( PortName.CHRL_TN, "Charlestown" );
        portNameMap.put( PortName.CHRLFT, "Charlesfort" );
        portNameMap.put( PortName.CMPCHE, "Campeche" );
        portNameMap.put( PortName.CP_D_VLA, "Cape de Vela" );
        portNameMap.put( PortName.CRACAS, "Caracas" );
        portNameMap.put( PortName.CRBNRS, "Carbaneras" );
        portNameMap.put( PortName.CRL_HRB, "Carlos Harbour" );
        portNameMap.put( PortName.CRTGNA, "Cartagena" );
        portNameMap.put( PortName.CY_D_MRQ, "Cayo de Marquis" );
        portNameMap.put( PortName.D_LISLE, "De L'isle" );
        portNameMap.put( PortName.FT_CRLN, "Fort Caroline" );
        portNameMap.put( PortName.FT_DE_FR, "Fort-de-France" );
        portNameMap.put( PortName.GANICA, "Guanica" );
        portNameMap.put( PortName.GIBARA, "Gibara" );
        portNameMap.put( PortName.GOLD_LK, "Golden Lake" );
        portNameMap.put( PortName.GRGETN, "Georgetown" );
        portNameMap.put( PortName.GRNVIL, "Grenville" );
        portNameMap.put( PortName.HAVANA, "Havana" );
        portNameMap.put( PortName.HRB_ISL, "Harbour Island" );
        portNameMap.put( PortName.IGUANA, "Iguana" );
        portNameMap.put( PortName.IRSH_PT, "Irish Point" );
        portNameMap.put( PortName.ISL_HRB, "Island Harbour" );
        portNameMap.put( PortName.JCB_CLK, "Jacob's Clock" );
        portNameMap.put( PortName.JEN_BAY, "Jenny Bay" );
        portNameMap.put( PortName.JQUEME, "Jaqueme" );
        portNameMap.put( PortName.LA_ISBL, "La Isabela" );
        portNameMap.put( PortName.LEOGAN, "Leogane" );
        portNameMap.put( PortName.LES_HTS, "Les Hattes" );
        portNameMap.put( PortName.MA_HRBR, "Marsh Harbour" );
        portNameMap.put( PortName.MARCBO, "Maracaibo" );
        portNameMap.put( PortName.MATT_TN, "Matthew Town" );
        portNameMap.put( PortName.MRGN_BF, "Morgan's Bluff" );
        portNameMap.put( PortName.NASSAU, "Nassau" );
        portNameMap.put( PortName.NAVIGATION_ZONE, "Navigation Zone" );
        portNameMap.put( PortName.NW_ORLN, "New Orleans" );
        portNameMap.put( PortName.ORLENS, "Orleans" );
        portNameMap.put( PortName.ORNJSD, "Oranjestad" );
        portNameMap.put( PortName.PNSCLA, "Pensacola" );
        portNameMap.put( PortName.PNT_A_PT, "Pointe-à-Pitre" );
        portNameMap.put( PortName.PRT_RYL, "Port Royal" );
        portNameMap.put( PortName.PT_DE_PX, "Port-de-Paix" );
        portNameMap.put( PortName.PT_PRNC, "Port del Principe" );
        portNameMap.put( PortName.PT_ST_JO, "Port St. Joe" );
        portNameMap.put( PortName.PTA_DE_P, "Puerta de Plata" );
        portNameMap.put( PortName.PTO_CBZ, "Puerto Cabezas" );
        portNameMap.put( PortName.PTOBLO, "Portobelo" );
        portNameMap.put( PortName.PTOF_SP, "Port-of-Spain" );
        portNameMap.put( PortName.RDG_ROK, "Riding Rocks" );
        portNameMap.put( PortName.RDL_HCH, "Rio de la Hacha" );
        portNameMap.put( PortName.RDY_COV, "Ruddy Cove" );
        portNameMap.put( PortName.ROSEAU, "Roseau" );
        portNameMap.put( PortName.RSGNOL, "Rosignol" );
        portNameMap.put( PortName.SBNQUI, "Sabanqui" );
        portNameMap.put( PortName.SISAL, "Sisal" );
        portNameMap.put( PortName.SN_CAT, "Santa Cataina" );
        portNameMap.put( PortName.SN_JUAN, "San Juan" );
        portNameMap.put( PortName.SN_MRCS, "San Marcos" );
        portNameMap.put( PortName.SNT_CLR, "Santa Clara" );
        portNameMap.put( PortName.SNT_DMG, "Santo Domingo" );
        portNameMap.put( PortName.SNTAGO, "Santiago" );
        portNameMap.put( PortName.SPAN_TN, "Spanish Town" );
        portNameMap.put( PortName.ST_AGST, "St. Augustine" );
        portNameMap.put( PortName.ST_JHNS, "St. John's" );
        portNameMap.put( PortName.ST_RS_BAY, "St. Rose's Bay" );
        portNameMap.put( PortName.TAMPA, "Tampa" );
        portNameMap.put( PortName.TMPICO, "Tampico" );
        portNameMap.put( PortName.TORTGA, "Tortuga" );
        portNameMap.put( PortName.TRNDAD, "Trinidad" );
        portNameMap.put( PortName.TRPTUD, "Turpitude" );
        portNameMap.put( PortName.TRT_BAY, "Turtling Bay" );
        portNameMap.put( PortName.VIUX_FT, "Vieux Fort" );
        portNameMap.put( PortName.VLA_HRM, "Villa Hermosa" );
        portNameMap.put( PortName.VRA_CRZ, "Vera Cruz" );
        portNameMap.put( PortName.WHITBY, "Whitby" );
        portNameMap.put( PortName.WST_END, "West End" );
    }
}