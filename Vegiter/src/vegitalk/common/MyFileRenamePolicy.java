package vegitalk.common;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.oreilly.servlet.multipart.FileRenamePolicy;

public class MyFileRenamePolicy implements FileRenamePolicy {

	@Override
	public File rename(File originFile) {
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
		int ranNum = (int)(Math.random()*1000000);
		
		String name = originFile.getName();
		String ext = "";
		int dot = name.lastIndexOf(".");
		if(dot != -1) {
			ext = name.substring(dot);
		}
		
		String newName = sdf.format(new Date()) + ranNum + ext;
		File renamedFile = new File(originFile.getParent(), newName);
		
		return renamedFile;
	}
}
