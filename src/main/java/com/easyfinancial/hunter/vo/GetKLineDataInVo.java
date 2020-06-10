/**
 * 
 */
package com.easyfinancial.hunter.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

/**
 * @author arco
 *
 */
@Slf4j
@Data
@NoArgsConstructor
@AllArgsConstructor
public class GetKLineDataInVo {

	//symbol=[市场][股票代码]&scale=[周期]&ma=no&datalen=[长度];
	private String symbol;
	private String scale;
	private String ma;
	private String datalen;
}
