<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/WEB-INF/views/include/taglib.jsp"%>
<html>
<head>
	 <title>非招标采购结果议题审批</title>
	 <meta name="decorator" content="default"/>
	 <%@ include file="/WEB-INF/views/include/head.jsp"%>
	 <link href="${ctxStatic}/common/trepsui-ext.css" type="text/css" rel="stylesheet" />
</head>
<body>

<div id="tabsMain" class="mini-tabs" activeIndex="0" plain="false" style="width:100%;height:100%;">
	<div title="列表" id="tabList"  style="border: 0px;"  >
             <sys:toolbargridmain objId="WzPlanResult" permissionEdit="wz:wzPlanResult:edit"></sys:toolbargridmain>
             <sys:searchadv></sys:searchadv>
			 <div class="mini-fit">
				<div id="datagridMain" class="mini-datagrid" style="width:100%;height:100%;"
					 url="${ctx}/wz-cg${wz_cg_suffix}/wz/wzPlanResult/data" idField="id"
					 allowResize="true" pageSize="20"
					 allowCellSelect="true" multiSelect="false"
					 editNextOnEnterKey="true"  editNextRowCell="true"
					 allowAlternating="true" showFilterRow="true"  showColumnsMenu="false"
				>
					<div property="columns">
						<div name="action" width="120"  headerAlign="center" align="center" renderer="onActionRenderer" cellStyle="padding:0;">操作</div>
							<div name="id"  field="id" vtype="required"  headerAlign="center" allowSort="true" width="100" >主键
								<input property="editor" class="mini-textbox"  style="width:100%;"  />
								<input id="id-Filter" name="mini-column-filter"  property="filter" class="mini-textbox"   style="width:100%;"
									   onvaluechanged="onFilterChanged" showClose="true" oncloseclick="onFilterClose(this)"
								/>
							</div>
							<div name="tenantId"  field="tenantId" vtype=""  headerAlign="center" allowSort="true" width="100" >租户id
								<input property="editor" class="mini-textbox"  style="width:100%;"  />
								<input id="tenantId-Filter" name="mini-column-filter"  property="filter" class="mini-textbox"   style="width:100%;"
									   onvaluechanged="onFilterChanged" showClose="true" oncloseclick="onFilterClose(this)"
								/>
							</div>
							<div name="createBy"  field="createBy" vtype=""  headerAlign="center" allowSort="true" width="100" >创建人id
								<input property="editor" class="mini-textbox"  style="width:100%;"  />
								<input id="createBy-Filter" name="mini-column-filter"  property="filter" class="mini-textbox"   style="width:100%;"
									   onvaluechanged="onFilterChanged" showClose="true" oncloseclick="onFilterClose(this)"
								/>
							</div>
							<div name="createByName"  field="createByName" vtype=""  headerAlign="center" allowSort="true" width="100" >创建人姓名
								<input property="editor" class="mini-textbox"  style="width:100%;"  />
								<input id="createByName-Filter" name="mini-column-filter"  property="filter" class="mini-textbox"   style="width:100%;"
									   onvaluechanged="onFilterChanged" showClose="true" oncloseclick="onFilterClose(this)"
								/>
							</div>
							<div name="createDate"  field="createDate" vtype=""  headerAlign="center" allowSort="true" width="100" >创建时间
								<input property="editor" class="mini-datepicker" style="width:100%;"  />
								<input id="createDate-Filter" name="mini-column-filter"  property="filter" class="mini-textbox" style="width:100%;"
									   onvaluechanged="onFilterChanged" showClose="true" oncloseclick="onFilterClose(this)"
								/>
							</div>
							<div name="createDept"  field="createDept" vtype=""  headerAlign="center" allowSort="true" width="100" >创建部门id
								<input property="editor" class="mini-textbox"  style="width:100%;"  />
								<input id="createDept-Filter" name="mini-column-filter"  property="filter" class="mini-textbox"   style="width:100%;"
									   onvaluechanged="onFilterChanged" showClose="true" oncloseclick="onFilterClose(this)"
								/>
							</div>
							<div name="createDeptName"  field="createDeptName" vtype=""  headerAlign="center" allowSort="true" width="100" >创建部门名称
								<input property="editor" class="mini-textbox"  style="width:100%;"  />
								<input id="createDeptName-Filter" name="mini-column-filter"  property="filter" class="mini-textbox"   style="width:100%;"
									   onvaluechanged="onFilterChanged" showClose="true" oncloseclick="onFilterClose(this)"
								/>
							</div>
							<div name="createCompany"  field="createCompany" vtype=""  headerAlign="center" allowSort="true" width="100" >创建公司id
								<input property="editor" class="mini-textbox"  style="width:100%;"  />
								<input id="createCompany-Filter" name="mini-column-filter"  property="filter" class="mini-textbox"   style="width:100%;"
									   onvaluechanged="onFilterChanged" showClose="true" oncloseclick="onFilterClose(this)"
								/>
							</div>
							<div name="createCompanyName"  field="createCompanyName" vtype=""  headerAlign="center" allowSort="true" width="100" >创建公司名称
								<input property="editor" class="mini-textbox"  style="width:100%;"  />
								<input id="createCompanyName-Filter" name="mini-column-filter"  property="filter" class="mini-textbox"   style="width:100%;"
									   onvaluechanged="onFilterChanged" showClose="true" oncloseclick="onFilterClose(this)"
								/>
							</div>
							<div name="updateBy"  field="updateBy" vtype=""  headerAlign="center" allowSort="true" width="100" >修改人id
								<input property="editor" class="mini-textbox"  style="width:100%;"  />
								<input id="updateBy-Filter" name="mini-column-filter"  property="filter" class="mini-textbox"   style="width:100%;"
									   onvaluechanged="onFilterChanged" showClose="true" oncloseclick="onFilterClose(this)"
								/>
							</div>
							<div name="updateByName"  field="updateByName" vtype=""  headerAlign="center" allowSort="true" width="100" >修改人姓名
								<input property="editor" class="mini-textbox"  style="width:100%;"  />
								<input id="updateByName-Filter" name="mini-column-filter"  property="filter" class="mini-textbox"   style="width:100%;"
									   onvaluechanged="onFilterChanged" showClose="true" oncloseclick="onFilterClose(this)"
								/>
							</div>
							<div name="code"  field="code" vtype=""  headerAlign="center" allowSort="true" width="100" >审批标包号
								<input property="editor" class="mini-textbox"  style="width:100%;"  />
								<input id="code-Filter" name="mini-column-filter"  property="filter" class="mini-textbox"   style="width:100%;"
									   onvaluechanged="onFilterChanged" showClose="true" oncloseclick="onFilterClose(this)"
								/>
							</div>
							<div name="createName"  field="createName" vtype=""  headerAlign="center" allowSort="true" width="100" >标包创建人
								<input property="editor" class="mini-textbox"  style="width:100%;"  />
								<input id="createName-Filter" name="mini-column-filter"  property="filter" class="mini-textbox"   style="width:100%;"
									   onvaluechanged="onFilterChanged" showClose="true" oncloseclick="onFilterClose(this)"
								/>
							</div>
							<div name="applyDate"  field="applyDate" vtype="" dateFormat="yyyy-MM-dd HH:mm:ss" headerAlign="center" allowSort="true" width="100" >申请日期
								<input property="editor" class="mini-textbox"  style="width:100%;"  />
								<input id="applyDate-Filter" name="mini-column-filter"  property="filter" class="mini-textbox"   style="width:100%;"
									   onvaluechanged="onFilterChanged" showClose="true" oncloseclick="onFilterClose(this)"
								/>
							</div>
							<div name="applyName"  field="applyName" vtype=""  headerAlign="center" allowSort="true" width="100" >审批发起人
								<input property="editor" class="mini-textbox"  style="width:100%;"  />
								<input id="applyName-Filter" name="mini-column-filter"  property="filter" class="mini-textbox"   style="width:100%;"
									   onvaluechanged="onFilterChanged" showClose="true" oncloseclick="onFilterClose(this)"
								/>
							</div>
							<div name="xqbmName"  field="xqbmName" vtype=""  headerAlign="center" allowSort="true" width="100" >需求部门审批人
								<input property="editor" class="mini-textbox"  style="width:100%;"  />
								<input id="xqbmName-Filter" name="mini-column-filter"  property="filter" class="mini-textbox"   style="width:100%;"
									   onvaluechanged="onFilterChanged" showClose="true" oncloseclick="onFilterClose(this)"
								/>
							</div>
							<div name="xqbmDate"  field="xqbmDate" vtype="" dateFormat="yyyy-MM-dd HH:mm:ss" headerAlign="center" allowSort="true" width="100" >需求部门审批时间
								<input property="editor" class="mini-textbox"  style="width:100%;"  />
								<input id="xqbmDate-Filter" name="mini-column-filter"  property="filter" class="mini-textbox"   style="width:100%;"
									   onvaluechanged="onFilterChanged" showClose="true" oncloseclick="onFilterClose(this)"
								/>
							</div>
							<div name="xqbmApproval"  field="xqbmApproval" vtype=""  headerAlign="center" allowSort="true" width="100" >需求部门审批意见
								<input property="editor" class="mini-textbox"  style="width:100%;"  />
								<input id="xqbmApproval-Filter" name="mini-column-filter"  property="filter" class="mini-textbox"   style="width:100%;"
									   onvaluechanged="onFilterChanged" showClose="true" oncloseclick="onFilterClose(this)"
								/>
							</div>
							<div name="cgbmName"  field="cgbmName" vtype=""  headerAlign="center" allowSort="true" width="100" >采购部门审核人
								<input property="editor" class="mini-textbox"  style="width:100%;"  />
								<input id="cgbmName-Filter" name="mini-column-filter"  property="filter" class="mini-textbox"   style="width:100%;"
									   onvaluechanged="onFilterChanged" showClose="true" oncloseclick="onFilterClose(this)"
								/>
							</div>
							<div name="cgbmDate"  field="cgbmDate" vtype="" dateFormat="yyyy-MM-dd HH:mm:ss" headerAlign="center" allowSort="true" width="100" >采购部门审批时间
								<input property="editor" class="mini-textbox"  style="width:100%;"  />
								<input id="cgbmDate-Filter" name="mini-column-filter"  property="filter" class="mini-textbox"   style="width:100%;"
									   onvaluechanged="onFilterChanged" showClose="true" oncloseclick="onFilterClose(this)"
								/>
							</div>
							<div name="cgbmApproval"  field="cgbmApproval" vtype=""  headerAlign="center" allowSort="true" width="100" >采购部门审批意见
								<input property="editor" class="mini-textbox"  style="width:100%;"  />
								<input id="cgbmApproval-Filter" name="mini-column-filter"  property="filter" class="mini-textbox"   style="width:100%;"
									   onvaluechanged="onFilterChanged" showClose="true" oncloseclick="onFilterClose(this)"
								/>
							</div>
							<div name="fgldName"  field="fgldName" vtype=""  headerAlign="center" allowSort="true" width="100" >分管领导审核人
								<input property="editor" class="mini-textbox"  style="width:100%;"  />
								<input id="fgldName-Filter" name="mini-column-filter"  property="filter" class="mini-textbox"   style="width:100%;"
									   onvaluechanged="onFilterChanged" showClose="true" oncloseclick="onFilterClose(this)"
								/>
							</div>
							<div name="fgldDate"  field="fgldDate" vtype="" dateFormat="yyyy-MM-dd HH:mm:ss" headerAlign="center" allowSort="true" width="100" >分管领导审批时间
								<input property="editor" class="mini-textbox"  style="width:100%;"  />
								<input id="fgldDate-Filter" name="mini-column-filter"  property="filter" class="mini-textbox"   style="width:100%;"
									   onvaluechanged="onFilterChanged" showClose="true" oncloseclick="onFilterClose(this)"
								/>
							</div>
							<div name="fgldApproval"  field="fgldApproval" vtype=""  headerAlign="center" allowSort="true" width="100" >分管领导审批意见
								<input property="editor" class="mini-textbox"  style="width:100%;"  />
								<input id="fgldApproval-Filter" name="mini-column-filter"  property="filter" class="mini-textbox"   style="width:100%;"
									   onvaluechanged="onFilterChanged" showClose="true" oncloseclick="onFilterClose(this)"
								/>
							</div>
							<div name="zjlName"  field="zjlName" vtype=""  headerAlign="center" allowSort="true" width="100" >总经理审核人
								<input property="editor" class="mini-textbox"  style="width:100%;"  />
								<input id="zjlName-Filter" name="mini-column-filter"  property="filter" class="mini-textbox"   style="width:100%;"
									   onvaluechanged="onFilterChanged" showClose="true" oncloseclick="onFilterClose(this)"
								/>
							</div>
							<div name="zjlDate"  field="zjlDate" vtype="" dateFormat="yyyy-MM-dd HH:mm:ss" headerAlign="center" allowSort="true" width="100" >总经理审核时间
								<input property="editor" class="mini-textbox"  style="width:100%;"  />
								<input id="zjlDate-Filter" name="mini-column-filter"  property="filter" class="mini-textbox"   style="width:100%;"
									   onvaluechanged="onFilterChanged" showClose="true" oncloseclick="onFilterClose(this)"
								/>
							</div>
							<div name="zjlApproval"  field="zjlApproval" vtype=""  headerAlign="center" allowSort="true" width="100" >总经理审核意见
								<input property="editor" class="mini-textbox"  style="width:100%;"  />
								<input id="zjlApproval-Filter" name="mini-column-filter"  property="filter" class="mini-textbox"   style="width:100%;"
									   onvaluechanged="onFilterChanged" showClose="true" oncloseclick="onFilterClose(this)"
								/>
							</div>
							<div name="applyEndDate"  field="applyEndDate" vtype="" dateFormat="yyyy-MM-dd HH:mm:ss" headerAlign="center" allowSort="true" width="100" >审批结束时间
								<input property="editor" class="mini-textbox"  style="width:100%;"  />
								<input id="applyEndDate-Filter" name="mini-column-filter"  property="filter" class="mini-textbox"   style="width:100%;"
									   onvaluechanged="onFilterChanged" showClose="true" oncloseclick="onFilterClose(this)"
								/>
							</div>
							<div name="status"  field="status" vtype=""  headerAlign="center" allowSort="true" width="100" >节点
								<input property="editor" class="mini-textbox"  style="width:100%;"  />
								<input id="status-Filter" name="mini-column-filter"  property="filter" class="mini-textbox"   style="width:100%;"
									   onvaluechanged="onFilterChanged" showClose="true" oncloseclick="onFilterClose(this)"
								/>
							</div>
							<div name="topicsStatus"  field="topicsStatus" vtype=""  headerAlign="center" allowSort="true" width="100" >状态
								<input property="editor" class="mini-textbox"  style="width:100%;"  />
								<input id="topicsStatus-Filter" name="mini-column-filter"  property="filter" class="mini-textbox"   style="width:100%;"
									   onvaluechanged="onFilterChanged" showClose="true" oncloseclick="onFilterClose(this)"
								/>
							</div>
							<div name="updateDate"  field="updateDate" vtype=""  headerAlign="center" allowSort="true" width="100" >修改时间
								<input property="editor" class="mini-datepicker" style="width:100%;"  />
								<input id="updateDate-Filter" name="mini-column-filter"  property="filter" class="mini-textbox" style="width:100%;"
									   onvaluechanged="onFilterChanged" showClose="true" oncloseclick="onFilterClose(this)"
								/>
							</div>
							<div name="noticeId"  field="noticeId" vtype=""  headerAlign="center" allowSort="true" width="100" >关联物资通知单id
								<input property="editor" class="mini-textbox"  style="width:100%;"  />
								<input id="noticeId-Filter" name="mini-column-filter"  property="filter" class="mini-textbox"   style="width:100%;"
									   onvaluechanged="onFilterChanged" showClose="true" oncloseclick="onFilterClose(this)"
								/>
							</div>
							<div name="noticeCode"  field="noticeCode" vtype=""  headerAlign="center" allowSort="true" width="100" >关联物资通知单编号
								<input property="editor" class="mini-textbox"  style="width:100%;"  />
								<input id="noticeCode-Filter" name="mini-column-filter"  property="filter" class="mini-textbox"   style="width:100%;"
									   onvaluechanged="onFilterChanged" showClose="true" oncloseclick="onFilterClose(this)"
								/>
							</div>
				</div>
			</div>
		 </div>
	</div>
	<div title="明细" id="tabForm"  style="border: 0px;"  >
		<sys:toolbarformmain permissionEdit="wz:wzPlanResult:edit"></sys:toolbarformmain>
                  <div id="editform" class="form" style="width:100%;">
					<div class="container"  style="width: 100%;"  >
						<div class="mini-clearfix ">
							<div class="mini-col-12">
								<div class="mini-panel" title="基本信息" width="auto" height="auto"
									 showCollapseButton="true" onbuttonclick="onPanelButtonClick" name="_panel_exp"

								>
									<input class="mini-hidden" name="id" id="id"/>
									<table border="0" cellpadding="3" cellspacing="3" >
										<tr>
											<td style="text-align:right;">租户id：</td>
											<td>
											   <input name="tenantId" id="tenantId" class="mini-textbox"  vtype = ""  required="false" />
											</td>
											<td style="text-align:right;">创建人id：</td>
											<td>
											   <input name="createBy" id="createBy" class="mini-textbox" readOnly="true"  vtype = "" required="false" />
											</td>

										</tr>
										<tr>
											<td style="text-align:right;">创建人姓名：</td>
											<td>
											   <input name="createByName" id="createByName" class="mini-textbox"  vtype = "" readOnly="true" required="false" />
											</td>
											<td style="text-align:right;">创建时间：</td>
											<td>
											   <input name="createDate" id="createDate" class="mini-datepicker"  vtype = "" readOnly="true" required="false"/>
											</td>

										</tr>
										<tr>
											<td style="text-align:right;">创建部门id：</td>
											<td>
											   <input name="createDept" id="createDept" class="mini-textbox"  vtype = ""  required="false" />
											</td>
											<td style="text-align:right;">创建部门名称：</td>
											<td>
											   <input name="createDeptName" id="createDeptName" class="mini-textbox"   vtype = "" required="false" />
											</td>

										</tr>
										<tr>
											<td style="text-align:right;">创建公司id：</td>
											<td>
											   <input name="createCompany" id="createCompany" class="mini-textbox"  vtype = ""  required="false" />
											</td>
											<td style="text-align:right;">创建公司名称：</td>
											<td>
											   <input name="createCompanyName" id="createCompanyName" class="mini-textbox"   vtype = "" required="false" />
											</td>

										</tr>
										<tr>
											<td style="text-align:right;">修改人id：</td>
											<td>
											   <input name="updateBy" id="updateBy" class="mini-textbox"  vtype = "" readOnly="true" required="false" />
											</td>
											<td style="text-align:right;">修改人姓名：</td>
											<td>
											   <input name="updateByName" id="updateByName" class="mini-textbox" readOnly="true"  vtype = "" required="false" />
											</td>

										</tr>
										<tr>
											<td style="text-align:right;">审批标包号：</td>
											<td>
											   <input name="code" id="code" class="mini-textbox"  vtype = ""  required="false" />
											</td>
											<td style="text-align:right;">标包创建人：</td>
											<td>
											   <input name="createName" id="createName" class="mini-textbox"   vtype = "" required="false" />
											</td>

										</tr>
										<tr>
											<td style="text-align:right;">申请日期：</td>
											<td>
											   <input name="applyDate" id="applyDate" class="mini-textbox"  vtype = ""  required="false" />
											</td>
											<td style="text-align:right;">审批发起人：</td>
											<td>
											   <input name="applyName" id="applyName" class="mini-textbox"   vtype = "" required="false" />
											</td>

										</tr>
										<tr>
											<td style="text-align:right;">需求部门审批人：</td>
											<td>
											   <input name="xqbmName" id="xqbmName" class="mini-textbox"  vtype = ""  required="false" />
											</td>
											<td style="text-align:right;">需求部门审批时间：</td>
											<td>
											   <input name="xqbmDate" id="xqbmDate" class="mini-textbox"   vtype = "" required="false" />
											</td>

										</tr>
										<tr>
											<td style="text-align:right;">需求部门审批意见：</td>
											<td>
											   <input name="xqbmApproval" id="xqbmApproval" class="mini-textbox"  vtype = ""  required="false" />
											</td>
											<td style="text-align:right;">采购部门审核人：</td>
											<td>
											   <input name="cgbmName" id="cgbmName" class="mini-textbox"   vtype = "" required="false" />
											</td>

										</tr>
										<tr>
											<td style="text-align:right;">采购部门审批时间：</td>
											<td>
											   <input name="cgbmDate" id="cgbmDate" class="mini-textbox"  vtype = ""  required="false" />
											</td>
											<td style="text-align:right;">采购部门审批意见：</td>
											<td>
											   <input name="cgbmApproval" id="cgbmApproval" class="mini-textbox"   vtype = "" required="false" />
											</td>

										</tr>
										<tr>
											<td style="text-align:right;">分管领导审核人：</td>
											<td>
											   <input name="fgldName" id="fgldName" class="mini-textbox"  vtype = ""  required="false" />
											</td>
											<td style="text-align:right;">分管领导审批时间：</td>
											<td>
											   <input name="fgldDate" id="fgldDate" class="mini-textbox"   vtype = "" required="false" />
											</td>

										</tr>
										<tr>
											<td style="text-align:right;">分管领导审批意见：</td>
											<td>
											   <input name="fgldApproval" id="fgldApproval" class="mini-textbox"  vtype = ""  required="false" />
											</td>
											<td style="text-align:right;">总经理审核人：</td>
											<td>
											   <input name="zjlName" id="zjlName" class="mini-textbox"   vtype = "" required="false" />
											</td>

										</tr>
										<tr>
											<td style="text-align:right;">总经理审核时间：</td>
											<td>
											   <input name="zjlDate" id="zjlDate" class="mini-textbox"  vtype = ""  required="false" />
											</td>
											<td style="text-align:right;">总经理审核意见：</td>
											<td>
											   <input name="zjlApproval" id="zjlApproval" class="mini-textbox"   vtype = "" required="false" />
											</td>

										</tr>
										<tr>
											<td style="text-align:right;">审批结束时间：</td>
											<td>
											   <input name="applyEndDate" id="applyEndDate" class="mini-textbox"  vtype = ""  required="false" />
											</td>
											<td style="text-align:right;">节点：</td>
											<td>
											   <input name="status" id="status" class="mini-textbox"   vtype = "" required="false" />
											</td>

										</tr>
										<tr>
											<td style="text-align:right;">状态：</td>
											<td>
											   <input name="topicsStatus" id="topicsStatus" class="mini-textbox"  vtype = ""  required="false" />
											</td>
											<td style="text-align:right;">修改时间：</td>
											<td>
											   <input name="updateDate" id="updateDate" class="mini-datepicker"  vtype = "" readOnly="true" required="false"/>
											</td>

										</tr>
										<tr>
											<td style="text-align:right;">关联物资通知单id：</td>
											<td>
											   <input name="noticeId" id="noticeId" class="mini-textbox"  vtype = ""  required="false" />
											</td>
											<td style="text-align:right;">关联物资通知单编号：</td>
											<td>
											   <input name="noticeCode" id="noticeCode" class="mini-textbox"   vtype = "" required="false" />
											</td>

										</tr>

										<tr>
										</tr>
									</table>
				                </div> <!--panel-->
				            </div> <!--mini-col-->
				        </div> <!--clearfix-->
				     </div> <!--container-->
				  </div> <!--editform-->
		        <div class="mini-fit">
						 <div id="tabsSub" class="mini-tabs" activeIndex="0" plain="false" style="width:100%;height:100%;">
								<div title="wz_fzb_plan_result" name="tabWzFzbPlanResultList"  style="border: 0px;"  >
									<sys:toolbargridsub girdId="gridWzFzbPlanResult" permissionEdit="wz:wzFzbPlanResult:edit"></sys:toolbargridsub>
									<div class="mini-fit">
									<div id="gridWzFzbPlanResult" class="mini-datagrid" style="width:100%;height:100%;"
										 url="${ctx}/wz-cg${wz_cg_suffix}/wz/wzFzbPlanResult/data" idField="id"
										 allowResize="true" pageSize="10"
										 allowCellSelect="true" allowCellEdit="true"
										 editNextOnEnterKey="true"  editNextRowCell="true" showFilterRow="false"
										 allowAlternating="true"    showColumnsMenu="true" multiSelect="true"
									>
										<div property="columns">
											<div type="checkcolumn"></div>

											<div name="id"  field="id" readOnly="true"  vtype="required" headerAlign="center" allowSort="true"  width="100" >主键
												<input property="editor" class="mini-textbox"  style="width:100%;"  />
												<input id="id-Filter" name="mini-column-filter"  property="filter" class="mini-textbox" style="width:100%;"
													   onvaluechanged="onFilterChangedChild(this,'gridWzFzbPlanResult')" showClose="true" oncloseclick="onChildFilterClose(this,'gridWzFzbPlanResult')"
												/>
											</div>
											<div name="tenantId"  field="tenantId"   vtype="" headerAlign="center" allowSort="true"  width="100" >租户id
												<input property="editor" class="mini-textbox"  style="width:100%;"  />
												<input id="tenantId-Filter" name="mini-column-filter"  property="filter" class="mini-textbox" style="width:100%;"
													   onvaluechanged="onFilterChangedChild(this,'gridWzFzbPlanResult')" showClose="true" oncloseclick="onChildFilterClose(this,'gridWzFzbPlanResult')"
												/>
											</div>
											<div name="createBy"  field="createBy" readOnly="true"  vtype="" headerAlign="center" allowSort="true"  width="100" >创建人id
												<input property="editor" class="mini-textbox"  style="width:100%;"  />
												<input id="createBy-Filter" name="mini-column-filter"  property="filter" class="mini-textbox" style="width:100%;"
													   onvaluechanged="onFilterChangedChild(this,'gridWzFzbPlanResult')" showClose="true" oncloseclick="onChildFilterClose(this,'gridWzFzbPlanResult')"
												/>
											</div>
											<div name="createByName"  field="createByName" readOnly="true"  vtype="" headerAlign="center" allowSort="true"  width="100" >创建人姓名
												<input property="editor" class="mini-textbox"  style="width:100%;"  />
												<input id="createByName-Filter" name="mini-column-filter"  property="filter" class="mini-textbox" style="width:100%;"
													   onvaluechanged="onFilterChangedChild(this,'gridWzFzbPlanResult')" showClose="true" oncloseclick="onChildFilterClose(this,'gridWzFzbPlanResult')"
												/>
											</div>
											<div name="createDate"  field="createDate" readOnly="true" vtype=""  headerAlign="center" allowSort="true" width="100" >创建时间
												<input property="editor" class="mini-datepicker" style="width:100%;"  />
												<input id="createDate-Filter" name="mini-column-filter"  property="filter" class="mini-textbox" style="width:100%;"
													   onvaluechanged="onFilterChangedChild(this,'gridWzFzbPlanResult')" showClose="true" oncloseclick="onChildFilterClose(this,'gridWzFzbPlanResult')"
												/>
											</div>
											<div name="createDept"  field="createDept"   vtype="" headerAlign="center" allowSort="true"  width="100" >创建部门id
												<input property="editor" class="mini-textbox"  style="width:100%;"  />
												<input id="createDept-Filter" name="mini-column-filter"  property="filter" class="mini-textbox" style="width:100%;"
													   onvaluechanged="onFilterChangedChild(this,'gridWzFzbPlanResult')" showClose="true" oncloseclick="onChildFilterClose(this,'gridWzFzbPlanResult')"
												/>
											</div>
											<div name="createDeptName"  field="createDeptName"   vtype="" headerAlign="center" allowSort="true"  width="100" >创建部门名称
												<input property="editor" class="mini-textbox"  style="width:100%;"  />
												<input id="createDeptName-Filter" name="mini-column-filter"  property="filter" class="mini-textbox" style="width:100%;"
													   onvaluechanged="onFilterChangedChild(this,'gridWzFzbPlanResult')" showClose="true" oncloseclick="onChildFilterClose(this,'gridWzFzbPlanResult')"
												/>
											</div>
											<div name="createCompany"  field="createCompany"   vtype="" headerAlign="center" allowSort="true"  width="100" >创建公司id
												<input property="editor" class="mini-textbox"  style="width:100%;"  />
												<input id="createCompany-Filter" name="mini-column-filter"  property="filter" class="mini-textbox" style="width:100%;"
													   onvaluechanged="onFilterChangedChild(this,'gridWzFzbPlanResult')" showClose="true" oncloseclick="onChildFilterClose(this,'gridWzFzbPlanResult')"
												/>
											</div>
											<div name="createCompanyName"  field="createCompanyName"   vtype="" headerAlign="center" allowSort="true"  width="100" >创建公司名称
												<input property="editor" class="mini-textbox"  style="width:100%;"  />
												<input id="createCompanyName-Filter" name="mini-column-filter"  property="filter" class="mini-textbox" style="width:100%;"
													   onvaluechanged="onFilterChangedChild(this,'gridWzFzbPlanResult')" showClose="true" oncloseclick="onChildFilterClose(this,'gridWzFzbPlanResult')"
												/>
											</div>
											<div name="updateBy"  field="updateBy" readOnly="true"  vtype="" headerAlign="center" allowSort="true"  width="100" >修改人id
												<input property="editor" class="mini-textbox"  style="width:100%;"  />
												<input id="updateBy-Filter" name="mini-column-filter"  property="filter" class="mini-textbox" style="width:100%;"
													   onvaluechanged="onFilterChangedChild(this,'gridWzFzbPlanResult')" showClose="true" oncloseclick="onChildFilterClose(this,'gridWzFzbPlanResult')"
												/>
											</div>
											<div name="updateByName"  field="updateByName" readOnly="true"  vtype="" headerAlign="center" allowSort="true"  width="100" >修改人姓名
												<input property="editor" class="mini-textbox"  style="width:100%;"  />
												<input id="updateByName-Filter" name="mini-column-filter"  property="filter" class="mini-textbox" style="width:100%;"
													   onvaluechanged="onFilterChangedChild(this,'gridWzFzbPlanResult')" showClose="true" oncloseclick="onChildFilterClose(this,'gridWzFzbPlanResult')"
												/>
											</div>
											<div name="projectName"  field="projectName"   vtype="" headerAlign="center" allowSort="true"  width="100" >项目名称
												<input property="editor" class="mini-textbox"  style="width:100%;"  />
												<input id="projectName-Filter" name="mini-column-filter"  property="filter" class="mini-textbox" style="width:100%;"
													   onvaluechanged="onFilterChangedChild(this,'gridWzFzbPlanResult')" showClose="true" oncloseclick="onChildFilterClose(this,'gridWzFzbPlanResult')"
												/>
											</div>
											<div name="category"  field="category"   vtype="" headerAlign="center" allowSort="true"  width="100" >标的类别
												<input property="editor" class="mini-textbox"  style="width:100%;"  />
												<input id="category-Filter" name="mini-column-filter"  property="filter" class="mini-textbox" style="width:100%;"
													   onvaluechanged="onFilterChangedChild(this,'gridWzFzbPlanResult')" showClose="true" oncloseclick="onChildFilterClose(this,'gridWzFzbPlanResult')"
												/>
											</div>
											<div name="budget"  field="budget"   vtype="" headerAlign="center" allowSort="true"  width="100" >采购概算
												<input property="editor" class="mini-textbox"  style="width:100%;"  />
												<input id="budget-Filter" name="mini-column-filter"  property="filter" class="mini-textbox" style="width:100%;"
													   onvaluechanged="onFilterChangedChild(this,'gridWzFzbPlanResult')" showClose="true" oncloseclick="onChildFilterClose(this,'gridWzFzbPlanResult')"
												/>
											</div>
											<div name="supplierName"  field="supplierName"   vtype="" headerAlign="center" allowSort="true"  width="100" >首选供应商
												<input property="editor" class="mini-textbox"  style="width:100%;"  />
												<input id="supplierName-Filter" name="mini-column-filter"  property="filter" class="mini-textbox" style="width:100%;"
													   onvaluechanged="onFilterChangedChild(this,'gridWzFzbPlanResult')" showClose="true" oncloseclick="onChildFilterClose(this,'gridWzFzbPlanResult')"
												/>
											</div>
											<div name="supplierPrice"  field="supplierPrice"   vtype="" headerAlign="center" allowSort="true"  width="100" >首选报价（万元）
												<input property="editor" class="mini-textbox"  style="width:100%;"  />
												<input id="supplierPrice-Filter" name="mini-column-filter"  property="filter" class="mini-textbox" style="width:100%;"
													   onvaluechanged="onFilterChangedChild(this,'gridWzFzbPlanResult')" showClose="true" oncloseclick="onChildFilterClose(this,'gridWzFzbPlanResult')"
												/>
											</div>
											<div name="substituteName"  field="substituteName"   vtype="" headerAlign="center" allowSort="true"  width="100" >备选供应商
												<input property="editor" class="mini-textbox"  style="width:100%;"  />
												<input id="substituteName-Filter" name="mini-column-filter"  property="filter" class="mini-textbox" style="width:100%;"
													   onvaluechanged="onFilterChangedChild(this,'gridWzFzbPlanResult')" showClose="true" oncloseclick="onChildFilterClose(this,'gridWzFzbPlanResult')"
												/>
											</div>
											<div name="substitutePrice"  field="substitutePrice"   vtype="" headerAlign="center" allowSort="true"  width="100" >备选报价（万元）
												<input property="editor" class="mini-textbox"  style="width:100%;"  />
												<input id="substitutePrice-Filter" name="mini-column-filter"  property="filter" class="mini-textbox" style="width:100%;"
													   onvaluechanged="onFilterChangedChild(this,'gridWzFzbPlanResult')" showClose="true" oncloseclick="onChildFilterClose(this,'gridWzFzbPlanResult')"
												/>
											</div>
											<div name="parentId" hideable="true" visible="false"  field="parentId" headerAlign="center" allowSort="true" width="150" >
												<input property="editor" class="mini-textbox" style="width:100%;" minWidth="200" />
											</div>


										</div>
									</div>
								 </div>
							  </div>
						 </div>
		        </div><!--fit-->

	    </div>

   </div>

<sys:toolbarfooter></sys:toolbarfooter>
<sys:excelframe></sys:excelframe>

<script type="text/javascript">

	initBase(
			{   id:"datagridMain",
			    objId:"WzPlanResult",
			    masterKeyField:"id",
				dataUrl:"${ctx}/wz-cg${wz_cg_suffix}/wz/wzPlanResult/data",
				getUrl:"${ctx}/wz-cg${wz_cg_suffix}/wz/wzPlanResult/get",
				saveUrl:"${ctx}/wz-cg${wz_cg_suffix}/wz/wzPlanResult/save",
				removeUrl:"${ctx}/wz-cg${wz_cg_suffix}/wz/wzPlanResult/remove",
				exportUrl:"${ctx}/wz-cg${wz_cg_suffix}/wz/wzPlanResult/export"
			 }
	       );

	initChilds( "#editform", "tabsMain" ,
                      [
	                    {
		                 id:"gridWzFzbPlanResult",
		                 objId:"WzFzbPlanResult",
		                 FK:"parentId",
		                 cascade:true,
		                 cascadeVisible:true,
		                 tabName:"tabWzFzbPlanResultList",
						 dataUrl:"${ctx}/wz-cg${wz_cg_suffix}/wz/wzFzbPlanResult/data",
						 getUrl:"${ctx}/wz-cg${wz_cg_suffix}/wz/wzFzbPlanResult/get",
						 saveUrl:"${ctx}/wz-cg${wz_cg_suffix}/wz/wzFzbPlanResult/save",
						 removeUrl:"${ctx}/wz-cg${wz_cg_suffix}/wz/wzFzbPlanResult/remove",
						 exportUrl:"${ctx}/wz-cg${wz_cg_suffix}/wz/wzFzbPlanResult/export"
	                    }
	                   ]
	);

	initQb( "#builder","pnlQuery", "tabsQuery", "txtSQL","btnAdvSearch",
			[
					{
						id: 'a.id',
						label: '主键',
						type: 'string',
						default_value: '',
						size: 100
					}
					,{
						id: 'a.tenant_id',
						label: '租户id',
						type: 'string',
						default_value: '',
						size: 100
					}
					,{
						id: 'a.create_by',
						label: '创建人id',
						type: 'string',
						default_value: '',
						size: 100
					}
					,{
						id: 'a.create_by_name',
						label: '创建人姓名',
						type: 'string',
						default_value: '',
						size: 100
					}
					,{
						id: 'a.create_date',
						label: '创建时间',
						type: 'string',
						default_value: '',
						size: 100
							,
							plugin: 'datepicker',
					    	plugin_config: {
							format: 'yyyy-mm-dd',
							todayBtn: 'linked',
							todayHighlight: true,
							autoclose: true,
							language:"zh-CN"
						   }
					}
					,{
						id: 'a.create_dept',
						label: '创建部门id',
						type: 'string',
						default_value: '',
						size: 100
					}
					,{
						id: 'a.create_dept_name',
						label: '创建部门名称',
						type: 'string',
						default_value: '',
						size: 100
					}
					,{
						id: 'a.create_company',
						label: '创建公司id',
						type: 'string',
						default_value: '',
						size: 100
					}
					,{
						id: 'a.create_company_name',
						label: '创建公司名称',
						type: 'string',
						default_value: '',
						size: 100
					}
					,{
						id: 'a.update_by',
						label: '修改人id',
						type: 'string',
						default_value: '',
						size: 100
					}
					,{
						id: 'a.update_by_name',
						label: '修改人姓名',
						type: 'string',
						default_value: '',
						size: 100
					}
					,{
						id: 'a.code',
						label: '审批标包号',
						type: 'string',
						default_value: '',
						size: 100
					}
					,{
						id: 'a.create_name',
						label: '标包创建人',
						type: 'string',
						default_value: '',
						size: 100
					}
					,{
						id: 'a.apply_date',
						label: '申请日期',
						type: 'datetime',
						default_value: '',
						size: 100
					}
					,{
						id: 'a.apply_name',
						label: '审批发起人',
						type: 'string',
						default_value: '',
						size: 100
					}
					,{
						id: 'a.xqbm_name',
						label: '需求部门审批人',
						type: 'string',
						default_value: '',
						size: 100
					}
					,{
						id: 'a.xqbm_date',
						label: '需求部门审批时间',
						type: 'datetime',
						default_value: '',
						size: 100
					}
					,{
						id: 'a.xqbm_approval',
						label: '需求部门审批意见',
						type: 'string',
						default_value: '',
						size: 100
					}
					,{
						id: 'a.cgbm_name',
						label: '采购部门审核人',
						type: 'string',
						default_value: '',
						size: 100
					}
					,{
						id: 'a.cgbm_date',
						label: '采购部门审批时间',
						type: 'datetime',
						default_value: '',
						size: 100
					}
					,{
						id: 'a.cgbm_approval',
						label: '采购部门审批意见',
						type: 'string',
						default_value: '',
						size: 100
					}
					,{
						id: 'a.fgld_name',
						label: '分管领导审核人',
						type: 'string',
						default_value: '',
						size: 100
					}
					,{
						id: 'a.fgld_date',
						label: '分管领导审批时间',
						type: 'datetime',
						default_value: '',
						size: 100
					}
					,{
						id: 'a.fgld_approval',
						label: '分管领导审批意见',
						type: 'string',
						default_value: '',
						size: 100
					}
					,{
						id: 'a.zjl_name',
						label: '总经理审核人',
						type: 'string',
						default_value: '',
						size: 100
					}
					,{
						id: 'a.zjl_date',
						label: '总经理审核时间',
						type: 'datetime',
						default_value: '',
						size: 100
					}
					,{
						id: 'a.zjl_approval',
						label: '总经理审核意见',
						type: 'string',
						default_value: '',
						size: 100
					}
					,{
						id: 'a.apply_end_date',
						label: '审批结束时间',
						type: 'datetime',
						default_value: '',
						size: 100
					}
					,{
						id: 'a.status',
						label: '节点',
						type: 'string',
						default_value: '',
						size: 100
					}
					,{
						id: 'a.topics_status',
						label: '状态',
						type: 'string',
						default_value: '',
						size: 100
					}
					,{
						id: 'a.update_date',
						label: '修改时间',
						type: 'string',
						default_value: '',
						size: 100
							,
							plugin: 'datepicker',
					    	plugin_config: {
							format: 'yyyy-mm-dd',
							todayBtn: 'linked',
							todayHighlight: true,
							autoclose: true,
							language:"zh-CN"
						   }
					}
					,{
						id: 'a.notice_id',
						label: '关联物资通知单id',
						type: 'string',
						default_value: '',
						size: 100
					}
					,{
						id: 'a.notice_code',
						label: '关联物资通知单编号',
						type: 'string',
						default_value: '',
						size: 100
					}
			]
	);
   loadWindow();
   //////////表格操作菜单项点击事件方法/////////
   function onGridOpMiClick(e){
     var menuItem=null;
     if(e.item==undefined){
        menuItem=e.sender.item;
     }else{
        menuItem=e.item;
     }

   }
   //////////form操作菜单项点击事件方法/////////
   function onFormOpMiClick(e){
     var menuItem=null;
     if(e.item==undefined){
        menuItem=e.sender.item;
     }else{
        menuItem=e.item;
     }
   }
   //////////子表格操作菜单项点击事件方法/////////
   function onGridSubOpMiClick_WzFzbPlanResult(e){
     var menuItem=null;
     if(e.item==undefined){
        menuItem=e.sender.item;
     }else{
        menuItem=e.item;
     }
   }

</script>
</body>
</html>