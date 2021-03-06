package egovframework.sample.service.impl;

import egovframework.sample.service.SampleDefaultVO;
import egovframework.sample.service.SampleVO;
import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("sampleDAO")
public class SampleDAO extends EgovAbstractDAO {

    /**
	 * 글을 수정한다.
	 * @param vo - 수정할 정보가 담긴 SampleVO
	 * @return void형
	 * @exception Exception
	 */
    public int updateSample(SampleVO vo) throws Exception {
        return update("sampleDAO.updateSample", vo);
    }

    /**
	 * 글을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 SampleVO
	 * @return void형
	 * @exception Exception
	 */
    public void deleteSample(SampleVO vo) throws Exception {
        delete("sampleDAO.deleteSample", vo);
    }



    /**
	 * 글 목록을 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return 글 목록
	 * @exception Exception
	 */
    public List<?> selectSampleList(SampleDefaultVO searchVO) throws Exception {
    	return list("sampleDAO.selectSampleList", searchVO);
    }
    
    /**
     * 글 목록을 전체 조회한다.
     * @param searchMap - 조회할 정보가 담긴 Map
     * @return 글 목록
     * @exception Exception
     */
    public List<?> axisSelectSampleList(SampleDefaultVO searchVO) throws Exception {
    	return list("sampleDAO.axisSelectSampleList", searchVO);
    }

    /**
	 * 글 총 갯수를 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return 글 총 갯수
	 * @exception
	 */
	public int selectSampleListTotCnt(SampleDefaultVO searchVO) {
        return (Integer) select("sampleDAO.selectSampleListTotCnt", searchVO);
    }

    /**
     * 글을 등록한다.
     * @param vo - 등록할 정보가 담긴 SampleVO
     * @return 등록 결과
     * @exception Exception
     */
    public Integer insertSample(SampleVO vo) throws Exception {
        return (Integer)insert("sampleDAO.insertSample", vo);
    }

    /**
     * 글을 조회한다.
     * @param vo - 조회할 정보가 담긴 SampleVO
     * @return 조회한 글
     * @exception Exception
     */
    public SampleVO selectSample(SampleVO vo) throws Exception {
        return (SampleVO) select("sampleDAO.selectSample", vo);
    }
}
