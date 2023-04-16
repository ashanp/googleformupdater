import io.github.stepio.jgforms.Configuration;
import io.github.stepio.jgforms.Submitter;
import io.github.stepio.jgforms.answer.Builder;
import io.github.stepio.jgforms.exception.NotSubmittedException;
import io.github.stepio.jgforms.question.MetaData;

import java.io.File;
import java.io.FileNotFoundException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public enum TestingClass implements MetaData{

    question1(1702524847L),
    question2(22024491L),
    question3(2073106199L),
    question4(110113770L),
    question5(347010873L),
    question6(505682079L),
    question7(1303166327L),
    question8(266114257L),
    question9(1812584099L),
    question10(647956950L),
    question11(1089042708L),
    question12(939249826L),
    question13(2133399873L),
    question14(341388668L),
    question15(978374049L),
    question16(1363509245L),
    question17(761362164L),
    question18(1456003331L),
    question19(44372978L),
    question20(1021462992L),
    question21(1812592353L),
    question22(786894020L),
    question23(469956797L),
    question24(89833327L),
    question25(1921694997L),
    question26(1574051709L),
    question27(635432468L),
    question28(1092076145L),
    question29(1638782591L),
    question30(497844958L),
    question31(1316448487L),
    question32(1041922215L),
    question33(1573182437L),
    question34(230691149L),
    question35(817412801L),
    question36(2000873107L),
    question37(1333652716L),
    question38(1677451041L),
    question39(1979051185L),
    question40(1994546192L),
    question41(1583865122L),
    question42(188029255L),
    question43(308668410L),
    question44(2071799312L),
    question45(1869223175L),
    question46(542069662L),
    question47(549343614L),
    question48(1781178200L),
    question49(185318989L),
    question50(14284292L),
    question51(1595272559L),
    question52(1407146525L),
    question53(1187842300L),
    question54(1137957161L),
    question55(204474481L),
    question56(417348666L),
    question57(1170204323L),
    question58(1762053108L),
    question59(1320065470L),
    question60(1600756752L),
    question61(1038373568L),
    question62(282044908L),
    question63(332942807L),
    question64(226052591L),
    question65(1859996923L),
    question66(235642188L);

    public static void updateForm(String question1_var, String question2_var, String question3_var, String question4_var, String question5_var, String question6_var, String question7_var, String question8_var, String question9_var, String question10_var, String question11_var, String question12_var, String question13_var, String question14_var, String question15_var, String question16_var, String question17_var, String question18_var, String question19_var, String question20_var, String question21_var, String question22_var, String question23_var, String question24_var, String question25_var, String question26_var, String question27_var, String question28_var, String question29_var, String question30_var, String question31_var, String question32_var, String question33_var, String question34_var, String question35_var, String question36_var, String question37_var, String question38_var, String question39_var, String question40_var, String question41_var, String question42_var, String question43_var, String question44_var, String question45_var, String question46_var, String question47_var, String question48_var, String question49_var, String question50_var, String question51_var, String question52_var, String question53_var, String question54_var, String question55_var, String question56_var, String question57_var, String question58_var, String question59_var, String question60_var, String question61_var, String question62_var, String question63_var, String question64_var, String question65_var, String question66_var
    ){
        try {
            Builder urlBuilder = Builder.formKey("1FAIpQLScOOkTMho3fSzGQ23_24joUiR8QAtszSOb9kLytO4iCn4mXjA")
                    .put(question1,question1_var).put(question2,question2_var).put(question3,question3_var)
                    .put(question4,question4_var).put(question5,question5_var).put(question6,question6_var)
                    .put(question7,question7_var).put(question8,question8_var).put(question9,question9_var)
                    .put(question10,question10_var).put(question11,question11_var).put(question12,question12_var)
                    .put(question13,question13_var).put(question14,question14_var).put(question15,question15_var)
                    .put(question16,question16_var).put(question17,question17_var).put(question18,question18_var)
                    .put(question19,question19_var).put(question20,question20_var).put(question21,question21_var)
                    .put(question22,question22_var).put(question23,question23_var).put(question24,question24_var)
                    .put(question25,question25_var).put(question26,question26_var).put(question27,question27_var)
                    .put(question28,question28_var).put(question29,question29_var).put(question30,question30_var)
                    .put(question31,question31_var).put(question32,question32_var).put(question33,question33_var)
                    .put(question34,question34_var).put(question35,question35_var).put(question36,question36_var)
                    .put(question37,question37_var).put(question38,question38_var).put(question39,question39_var)
                    .put(question40,question40_var).put(question41,question41_var).put(question42,question42_var)
                    .put(question43,question43_var).put(question44,question44_var).put(question45,question45_var)
                    .put(question46,question46_var).put(question47,question47_var).put(question48,question48_var)
                    .put(question49,question49_var).put(question50,question50_var).put(question51,question51_var)
                    .put(question52,question52_var).put(question53,question53_var).put(question54,question54_var)
                    .put(question55,question55_var).put(question56,question56_var).put(question57,question57_var)
                    .put(question58,question58_var).put(question59,question59_var).put(question60,question60_var)
                    .put(question61,question61_var).put(question62,question62_var).put(question63,question63_var)
                    .put(question64,question64_var).put(question65,question65_var).put(question66,question66_var);
            URL url = urlBuilder.toUrl();
            Submitter submitter = new Submitter(new Configuration());
            try {
                submitter.submitForm(url);
                System.out.println("Submitted form");
            } catch (NotSubmittedException ex) {
                ex.printStackTrace();
                // TODO: log & handle the exception properly
            }
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        try {
            File myObj = new File("C:\\Users\\ashan\\Development\\eclipse\\eclipse-workspace\\googleformupdater\\src\\main\\resources\\config.tbl");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                String datamap[] = data.split("\\|");
                System.out.println("Inserting data to form: " + datamap[0]);
                //updateForm(datamap[0], datamap[1], datamap[2], datamap[3]);
                updateForm(datamap[0],datamap[1],datamap[2],datamap[3],datamap[4],datamap[5],datamap[6],datamap[7],datamap[8],datamap[9],datamap[10],datamap[11],datamap[12],datamap[13],datamap[14],datamap[15],datamap[16],datamap[17],datamap[18],datamap[19],datamap[20],datamap[21],datamap[22],datamap[23],datamap[24],datamap[25],datamap[26],datamap[27],datamap[28],datamap[29],datamap[30],datamap[31],datamap[32],datamap[33],datamap[34],datamap[35],datamap[36],datamap[37],datamap[38],datamap[39],datamap[40],datamap[41],datamap[42],datamap[43],datamap[44],datamap[45],datamap[46],datamap[47],datamap[48],datamap[49],datamap[50],datamap[51],datamap[52],datamap[53],datamap[54],datamap[55],datamap[56],datamap[57],datamap[58],datamap[59],datamap[60],datamap[61],datamap[62],datamap[63],datamap[64],datamap[65]);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    private long id;
    TestingClass(long id){
        this.id = id;
    }

    @Override
    public long getId() {
        return this.id;
    }

    @Override
    public void setId(long id){
        this.id = id;
    }
}
