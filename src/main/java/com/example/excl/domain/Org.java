package com.example.excl.domain;


import lombok.Data;
import lombok.ToString;

import java.math.BigDecimal;
import java.util.Date;

@Data
@ToString
public class Org {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String action;
	private String provNm;
	private String prov;
	private String adminEmpNo;//总部管理员uuid
	private String adminLoginId;//总部管理员loginid
	private Integer settlementAccountType;// 结算账户类型1对公，2对私
	private Integer orgRunProp;// 机构模式
	private String orgRegistNum; // 机构注册号
	private String legalPersonNm; // 法人姓名
	private String legalCard; // 法人身份证号
	private String registAddress; // 注册地址
	private String registCapitall; // 注册资本
	private String empOperationId;// 运营人员
	private String empCooperateManagerId;// 合作经理id
	private String empCooperateManagerNm;// 合作经理
	private String empOperationDeptId;// 运营人员所在部门
	private String empCooperateManagerDeptId;
	private String expandNm; // 拓展员名称
	private String expandNo; // 拓展员编号
	private String signDate; // 签约日期
	private String breakSignDate; // 解约日期
	private String idNumber;// 身份证号
	private String bankAccount;// 银行账号
	private String accNumber;// 账号户名
	private String bankName;// 开户行名称
	private String accOpenBranch;// 开户支行名称
	private String accProvince;// 结算账户所在省
	private String accountCity;// 结算账户所在市
	private Integer provideInvoice;// 是否提供发票
	private Integer hasStockBus;// 是否有存量商户
	private String recipientName;// 存量商户接收人名称
	private String recipientNumber;// 接收人编号
	private String refundDepositTime;// 退保证金时间
	private String mainContract;// 签约主体
	private String regionalAgency;// 代理区域
	private String regionalAgencyStr;

	private String depositmarginReceivable;// 应收保证金
	private String paidDeposit;// 实收保证金
	private String depositTime;// 保证金到账时间
	private String networkServiceFee;// 入网服务费
	private String agreementDate;// 协议签订日期
	private Integer filingProtocolState;// 协议归档状态
	private Integer authorizedNameplate;// 授权铭牌 1无 2有
	private String branchAttributionName;// 归属分公司名字
	private Integer agentLever;// 代理商级别0普通1黑名单2二星、
	private String backCardNum;// 银行卡关联行号
	private Integer empNum;// 直属下属员工数量
	private Integer deptNum;// 直属下属部门
	private Integer orgChildNum;// 直属下属机构
	private String parentOrg;// 上级机构
	private String parentNm;
	private String accountNo;
	private BigDecimal checkDiscount;
	private BigDecimal checkCut;
	private Long agentNumber;
	private long virtualAccountId;
	private String fromFunction;
	private Integer provCd;// 代理商经营城市所在的省份
	private Integer cityCdb; // 代理商经营城市
	
	private String orgUuid;  // 机构编号
	private String orgNm;  // 机构名称
	private Integer orgSts;  // 机构状态 1:正常，2：停用，9：注销
	private String cityCd;  // 所在城市编码（电话区号）
	private String cityNm;  // 所在城市
	private String orgAddr;  // 机构地址
	private String orgZip;  // 邮政编码
	private String orgTelNo;  // 机构电话
	private String orgFax;  // 传真
	private String contact;  // 联系人
	private String contactTelNo;  // 联系人电话
	private String contactMail;  // 联系人邮箱
	private Integer activeFlg;  // 删除标志位#0:删除 #1:ACTIVE
	private String createdStaffId;  // 首次创建人
	private String updatedStaffId;  // 最后修改人
	private Date dateCreated;  // 创建时间
	private Date lastUpdated;  // 最后修改时间
	private Integer orgProp;  // 1:内部机构，2：代理商.3：合作伙伴
	private String orgNmSpell;  // 机构名称拼音首字母
	private String createdStaffNm;  // CREATED_STAFF_NM
	private String updatedStaffNm;  // UPDATED_STAFF_NM
	private String orgUuid2;  // ORG_UUID2
	private String orgNm2;  // ORG_NM2
	private String branchAttribution;  // 归属分公司
	private String areaNm;
	private String orgList;
	private String endCreate;
	private String startCreate;
	 private int MAX_STORAGE_NUM; //终端附件一次最大入库数量
	
	private int leverNo;
	private String topAgentNm;//所属一代名称
	
	protected String authorizationAreaType;//授权区域类型：0单地市 1多地市 2类省代 3省代
	protected String isOfferInvoice;//是否提供发票 0否 1是
	protected String mercAgentTypes;//代理商类型 1pos 2手刷
	private String newOrgUuid;	//新一代接收机构
	private String newOrgNm;	//新一代接收机构名称
	private String topAgentUuid;//所属一代
	
	private String lastConfirmTime;//最后确认时间
	
	//对公结算账号信息
	private String settleAccount;
	private String accountName;
	private String cnapsCode;
	private String openbankName;
	private String posAgent;//pos代理商标识
	private String handAgent;//手刷代理商标识
	private String vvAgent;//vv代理商标识
	private String onlineAgent;//线上代理上标识
	
	// 机构编号信息
	private String orgCode;
	private String parentOrgCode;
	private String orgArch;
	
	private String inOrgs;
	
	// 优质商户标志
	private String expandMercType;
	
	//2017-08-11 敏感数据手机号
	private String contactTelNoEncrypt;
	private String orgTelNoEncrypt;
	
	//敏感字段加密   结算账户密文
	private String settleAccountEncrypt;
	//帐户名密文
    private String orgAccountNameEncrypt;
    // 法人姓名密文
    private String legalPersonNmEncrypt; 
    // 法人身份证号密文
    private String legalCardEncrypt;
    //签约主体密文
    private String mainContractEncrypt;
    
    //优质二类小微
    private String expandSmallMercType;
    
    /**
     * 财务支撑系统分润模块
     */
    //扣除保证金金额
    private String deductionsDepositMargin;
    //基础分润比例
    private String baseProfitRatio;
    //高签分润比例
    private String highProfitRatio;
    //上传数量
    private Integer totalNum;
    //身份证号
    private String idCardNm;

    //开户行信息
    private String lbnkNo;//开户银信息
	private String lbnkNm;//开户支行信息
	private String branchName;
	private String channelBusinessType;
}