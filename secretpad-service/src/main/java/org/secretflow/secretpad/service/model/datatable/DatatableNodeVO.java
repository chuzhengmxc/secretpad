/*
 * Copyright 2024 Ant Group Co., Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.secretflow.secretpad.service.model.datatable;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

/**
 * Datatable view object with node id and node name
 *
 * @author guanxi
 * @date 2024/7/12
 */
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class DatatableNodeVO {

    private static final String DATA_MESH_DATATABLE_TYPE = "table";
    private static final String DATATABLE_TYPE = "CSV";

    private DatatableVO datatableVO;

    /**
     * Node name the table belongs to
     */
    @Schema(description = "node name the table belongs to")
    private String nodeName;

    /**
     * Node id the table belongs to
     */
    @Schema(description = "node id the table belongs to")
    private String nodeId;

}