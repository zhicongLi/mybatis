package test;

import com.alibaba.fastjson.JSONArray;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

public class JsonArray {

    public static void main(String[] args) throws ParseException {
        /*String s = "[{\"achievement\":\"无\",\"approvalDept\":\"dd976434a53f3a010f5b973072cae7bc\"," +
                "\"approvalDeptName\":\"王铭佳\",\"backApproval\":\"\",\"billType\":" +
                "\"采购计划审批\",\"bmfzrId\":\"4e9dd7d4ea64b6ff096f834c7d05d020\"," +
                "\"bmfzrName\":\"刘培红\",\"bmzrId\":\"266ebf554f3f97a736671ee9fea89aa3\"," +
                "\"bmzrName\":\"郑凯\",\"budget\":\"805\",\"category\":\"0\",\"cgdlApproval\"" +
                ":\"同意\",\"cgdlMan\":\"郁飞腾\",\"cgdlTime\":\"2022-11-30\",\"cgzcApproval\":" +
                "\"同意\",\"cgzcMan\":\"郭华绮\",\"cgzcTime\":\"2022-11-30\",\"classification\":" +
                "\"1\",\"code\":\"26132211201\",\"contractPeriod\":\"0\",\"createBy\":" +
                "\"6ea779353151cc77a6ba4b65b736a626\",\"createByName\":\"李延峰\"," +
                "\"createCompany\":\"2613\",\"createCompanyName\":" +
                "\"国能江苏电力工程技术有限公司\",\"createDate\":" +
                "\"2022-11-30T10:19:25\",\"createDept\":" +
                "\"110120501\",\"createDeptName\":\"财务部\"," +
                "\"dbName\":\"postgresql\",\"delFlag\":\"0\",\"dept\"" +
                ":\"国能江苏电力工程技术有限公司\",\"deptCode\":\"2295\"," +
                "\"detailedList\":\"\",\"detailedMoney\":\"2\"," +
                "\"duration\":" +
                "\"1.团体意外伤害保险、企业补充团体医疗保险、重大疾病保险自2023年1月1日起至2023年6月30日止。" +
                "\\n2.团体长期护理保险、团体终身重大疾病保险自2023年1月1日起至2023年12月31日止。\",\"emergencyOrder\":" +
                "\"1\",\"id\":\"70560e6c223bd4c8c58ce46e6d1f67a4987069\",\"initiator\":\"李延峰\"," +
                "\"isNewRecord\":false,\"isgenerate\":\"1\",\"issc\":\"1\",\"itemId\":" +
                "\"\",\"jobContent\":\"\",\"jscgApproval\":\"同意\",\"jscgMan\":\"栾浩\"," +
                "\"jscgTime\":\"2022-12-06\",\"jurisdiction\":\"0\",\"moneyResource\":\"6\"," +
                "\"otherCost\":\"\",\"otherTaxrate\":\"\",\"page\":{\"count\":0,\"disabled\":true," +
                "\"first\":0,\"firstPage\":false,\"firstResult\":0,\"funcName\":\"page\",\"funcParam\":" +
                "\"\",\"groupBy\":\"\",\"last\":0,\"lastPage\":false,\"list\":[],\"maxResults\":-1," +
                "\"next\":2,\"notCount\":false,\"orderBy\":\"\",\"pageNo\":1,\"pageSize\":-1,\"prev\"" +
                ":0,\"totalPage\":0},\"parentId\":\"\",\"paymentMethod\":\"根据险种及实际参保名单按时结算\"," +
                "\"peopleSituation\":\"无\",\"planBasis\":\"9\",\"planNumber\":\"\",\"planStartTime\":" +
                "\"2022-12-31\",\"planStatus\":\"8\",\"planTime\":\"2022-11-30\",\"plate\":\"0\"," +
                "\"priceFormula\":\"\",\"procurementBasis\"" +
                ":\"1.《国家能源集团采购管理规定（试行）》（国家能源制度【2020】72号 第二十二条达到招标限额，" +
                "符合国家法律法规可以不进行招标的特殊情形，或符合下列条件之一的，可采用非招标方式进行采购。（一" +
                "）符合《不适宜招标服务类项目目录》相关规定的。\\n2.国家能源能集团采购管理规定（试行），" +
                "国家能源制度【2020】72号，第四章采购方式管理，第二十三条除第二十二条规定外，无论项目金额大小，" +
                "符合以下条件之一的，按规定采用相应非招标采购方式：（四）7.符合内部专业化单位相关规定，向集团公司（子分公司）《内部专业化单位名录》内企业采购的。" +
                "\\n3.《国家能源集团非招标采购实施办法（试行）》（国家能源制度【2020】174号）不适宜招标服务类项目目录第5项“保险及财务服务-补充医疗保险、" +
                "s重疾意外险”可以采用单一来源。\\n4.关于印发《国家能源集团内部专业化单位名录（2022年第七版）》的通知（综合物资【2022】158号）。" +
                "\\n5.在年度综合计划范围内，费用列支人工成本。\",\"procurementMethod\":\"2\",\"projectDescribe\":\"为切实维护职工合法权益，" +
                "及早实现补充医疗保险全覆盖，改善公司员工医疗费负担，建立员工风险保障体系，从而提高企业凝聚力和向心力，结合公司“我为群众办实事”工作的实施，" +
                "采购员工团体商业健康保险，包括意外伤害险、门急诊及住院保险、重大疾病保险及附加险、长期护理保险、终身重大疾病险等。\",\"projectName\":\"国能江苏电力工程技术有限公司2023年度员工团体商业健康保险服务\",\"reason\":\"该公司在集团" +
                "《关于印发<国家能源集团内部专业化单位名录（2022年第七版）>的通知》专业化单位名录内。\",\"remark\":\"\",\"reviewMethod\"" +
                ":\"4\",\"scoring\":\"\",\"scryId\":\"\",\"scryName\":\"\",\"sonCompany\":\"江苏公司\",\"sqlMap\":{},\"stage\":" +
                "\"3\",\"status\":\"8\",\"stopReason\":\"\",\"submitMonth\":\"2022-12\",\"supplier\":\"瑞泰人寿保险有限公司\",\"taxrate\"" +
                ":\"2\",\"tenantId\":\"000000\",\"whetherMetting\":\"0\",\"workload\":\"工程技术公司员工团体商业健康保险，" +
                "包括意外伤害险预计24万元、重大疾病保险预计77万元、门急诊及住院保险预计44万元、长期护理保险预计460万元、终身重大疾病保险预计200万元，" +
                "预计费用共计约805万元。\",\"xqdwApproval\":\"同意\",\"xqdwMan\":\"诸平\",\"xqdwTime\":\"2022-11-30\",\"zygkApproval\"" +
                ":\"同意\",\"zygkMan\":\"王铭佳\",\"zygkTime\":\"2022-11-30\",\"_id\":1,\"_uid\":1}]";*/

        String s = "[{\"submitMonth\":\"2022-12-01\"}]";
        List<WzPlan> list = JSONArray.parseArray(s,WzPlan.class);

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM");
        simpleDateFormat.parse("2022-12");
    }
}
